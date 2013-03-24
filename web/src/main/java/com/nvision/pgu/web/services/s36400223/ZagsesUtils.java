package com.nvision.pgu.web.services.s36400223;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.ProtocolException;
import java.net.URL;
import java.nio.charset.Charset;

/**
 * @author <a href="mailto:vmostovoy@at-consulting.ru">Mostovoy Vladislav</a>
 * @version $Revision$
 */
public class ZagsesUtils {

	private static Logger logger = LoggerFactory.getLogger(ZagsesUtils.class);

	private static final String CHARSET_NAME = "UTF-8";

	public static String sendSoap(String endPoint, String soapAction, String xmlRequest) {

			String response = "";

			try {
				logger.info("ENDPOINT: " + endPoint);
				logger.info("REQUEST: " + xmlRequest);

				URL srvUrl = new URL(endPoint);
				HttpURLConnection httpConnection = (HttpURLConnection) srvUrl.openConnection();

				byte[] buff = xmlRequest.getBytes(Charset.forName(CHARSET_NAME));

				//Настраиваем HTTP хидеры
				httpConnection.setRequestProperty("Content-Length", String.valueOf(buff.length));
				httpConnection.setRequestProperty("Content-Type", "text/xml; charset=" + CHARSET_NAME);
				httpConnection.setRequestProperty("SOAPAction", soapAction);

				try {
					httpConnection.setRequestMethod("POST");
				} catch (ProtocolException e) {
					logger.error("SOAP: " + e.getLocalizedMessage(), e);
				}

				httpConnection.setDoOutput(true);
				httpConnection.setDoInput(true);

				//Отсылаем SOAP
				OutputStream dstStream = null;
				try {
					dstStream = httpConnection.getOutputStream();
					dstStream.write(buff);

				} catch (IOException e) {
					logger.error(e.getLocalizedMessage(), e);

				} finally {
					if (dstStream != null) {
						dstStream.close();
					}
				}

				BufferedReader responseStream = new BufferedReader(new InputStreamReader(httpConnection.getInputStream(), CHARSET_NAME));

				String str;
				while ((str = responseStream.readLine()) != null) {
					response += str;
				}
				logger.info("RESPONCE: " + response);

			} catch (IOException e) {
				logger.error(e.getLocalizedMessage(), e);
			}
			return response;
		}
}
