package ru.lanit.samara.pgu.core.util.formasmap;

import ru.lanit.samara.pgu.core.util.IPrivateRoomDataContainer;

import java.util.Map;

/**
 * Интерфейс отображения, хранящего данные с формы
 */
public interface FormAsMap extends Map<String,Object> {

    public void clearFileLoadField(String fileLoadFieldName);

    public void clearForOrdering();

    public void fillWithPrivateRoomData(IPrivateRoomDataContainer privateRoomDataContainer);

}
