package ru.lanit.samara.pgu.core.util.formasmap.processors.preordering;

import ru.lanit.samara.pgu.core.util.IPrivateRoomDataContainer;
import ru.lanit.samara.pgu.core.util.formasmap.FormAsMap;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

/**
 * Абстрактный декоратор отображения, хранящего данные формы.
 * В его потомках при необходимости должна быть реализована логика модификации данных перед отправкой в ВИС
 * (см. методы clearForOrdering и fillWithPrivateRoomData).
 */
public class AbstractPreorderingProcessor implements FormAsMap {

    protected FormAsMap decoratedFormAsMap;

    public AbstractPreorderingProcessor(FormAsMap formAsMap) {
        this.decoratedFormAsMap = formAsMap;
    }

    @Override
    public void clearFileLoadField(String fileLoadFieldName) {
        this.decoratedFormAsMap.clearFileLoadField(fileLoadFieldName);
    }

    @Override
    public void clearForOrdering() {
        this.decoratedFormAsMap.clearForOrdering();
    }

    @Override
    public void fillWithPrivateRoomData(IPrivateRoomDataContainer privateRoomDataContainer) {
        this.decoratedFormAsMap.fillWithPrivateRoomData(privateRoomDataContainer);
    }

    @Override
    public int size() {
        return this.decoratedFormAsMap.size();
    }

    @Override
    public boolean isEmpty() {
        return this.decoratedFormAsMap.isEmpty();
    }

    @Override
    public boolean containsKey(Object key) {
        return this.decoratedFormAsMap.containsKey(key);
    }

    @Override
    public boolean containsValue(Object value) {
        return this.decoratedFormAsMap.containsValue(value);
    }

    @Override
    public Object get(Object key) {
        return this.decoratedFormAsMap.get(key);
    }

    @Override
    public Object put(String key, Object value) {
        return this.decoratedFormAsMap.put(key, value);
    }

    @Override
    public Object remove(Object key) {
        return this.decoratedFormAsMap.remove(key);
    }

    @Override
    public void putAll(Map<? extends String, ? extends Object> m) {
        this.decoratedFormAsMap.putAll(m);
    }

    @Override
    public void clear() {
        this.decoratedFormAsMap.clear();
    }

    @Override
    public Set<String> keySet() {
        return this.decoratedFormAsMap.keySet();
    }

    @Override
    public Collection<Object> values() {
        return this.decoratedFormAsMap.values();
    }

    @Override
    public Set<Entry<String, Object>> entrySet() {
        return this.decoratedFormAsMap.entrySet();
    }
}
