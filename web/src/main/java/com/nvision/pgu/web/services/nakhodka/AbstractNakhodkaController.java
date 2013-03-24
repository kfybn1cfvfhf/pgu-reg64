package com.nvision.pgu.web.services.nakhodka;

import com.nvision.pgu.core.controllers.AbstractServiceOrderController;
import com.nvision.pgu.core.exceptions.ShowErrorToUserException;
import com.nvision.pgu.core.services.ServiceResponseException;

import java.util.Map;

/**
 * Created by IntelliJ IDEA.
 * User: ochiruhin
 * Date: 2/21/12
 * Time: 5:29 PM
 * To change this template use File | Settings | File Templates.
 */
public abstract class AbstractNakhodkaController<Form extends AbstractNakhodkaForm> extends AbstractServiceOrderController<Form> {
    public static final String SOURCE_NAME = "NAKHODKA_SOURCE";
    public static final String SOURCE_ID_BY_SELECTED_REGION_PARAMETER = "nakhodkaSourceIdByUserSelectedRegion";
    public static final String DICTIONARY_NOT_FOUND_MESSAGE = "Dictionary {} not found.";
    public static final String OKATO_NOT_FOUND_MESSAGE = "Код ОКАТО региона не найден в справочнике {}";
    public static final String OKATO_PARAM_CANNOT_BE_EXTRACTED = "Невозможно определить код ОКАТО региона.";

	/**
	 * Отличается от AbstractServiceOrderController.orderService(form, model) тем,
	 * что преобразует окато к базовому (57401000000 -> 57000000000)
	 *
	 * @param form
	 * @param model
	 * @return ServiceOrderingService
	 */
	@Override
	public Object orderService(Form form, java.util.Map<java.lang.String,java.lang.Object> model) {
		final StepMeta stepMeta = getCurrentStepMeta(form);
		String xml = null, signedXml = null;
		try {
			xml = buildXML(form, model, stepMeta.getXmlTemplateName());
            signedXml = (String) transformRequestForSign(xml, model);
            signedXml = signedXml.trim().replaceFirst("^([\\W]+)<","<");
		} catch (ShowErrorToUserException e) {
			logger.error("Error while building or signing xml: ", e);
		}
		logger.info("SIGNED XML: \n" + signedXml);
		try {
            Object result = getServiceOrderingService().orderService(form.getOrderId(),
					form.getServiceTargetExtId(),
					String.valueOf(getServiceId()),
					getUserSelectedTopRegion(model),
					form.getPguAssertion().getPrincipal().getUserId(),
					form.getPguAssertion().getPrincipal().getAuthToken(), signedXml, "UTF-8", null, null, false);
            return result;
		} catch (ServiceResponseException e) {
			logger.error("Error in overridden orderService:", e);
		}

		return null;
	}

    @Override
    protected void fillModelByForm(Map<String, Object> model, Form form) throws ShowErrorToUserException {
        super.fillModelByForm(model, form);
        form.setRegionMappingType(AbstractNakhodkaForm.REGION_MAPPING_TYPE_DATABASE);

        try {
            form.setOkato(getUserSelectedTopRegion(model));
        } catch (Exception e) {
            logger.warn(OKATO_PARAM_CANNOT_BE_EXTRACTED);
            form.setRegionMappingType(AbstractNakhodkaForm.REGION_MAPPING_TYPE_DISABLED);
        }

        /*try {
            String sourceId = getDicRegistry().getItemByKey(SOURCE_NAME, getUserSelectedRegion(model)).getName();
            model.put(SOURCE_ID_BY_SELECTED_REGION_PARAMETER, sourceId);
        } catch (DicNotFoundException e) {
            logger.warn(DICTIONARY_NOT_FOUND_MESSAGE,SOURCE_NAME);
        } catch (DicItemNotFoundException e) {
            logger.error(OKATO_NOT_FOUND_MESSAGE,SOURCE_NAME);
        }*/
    }
}
