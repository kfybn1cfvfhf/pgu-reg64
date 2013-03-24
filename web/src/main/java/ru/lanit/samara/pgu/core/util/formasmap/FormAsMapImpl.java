package ru.lanit.samara.pgu.core.util.formasmap;

import com.nvision.pgu.core.util.FileBean;
import ru.lanit.samara.pgu.core.util.IPrivateRoomDataContainer;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * Класс-обёртка, расширяющий Map функционалом, специфичным для отображения, хранящего данные с формы.
 * Методы интерфейса Map проксируются на обёрнутое отображение.
 */
public class FormAsMapImpl implements FormAsMap {

    private Map<String, Object> map;

    public FormAsMapImpl(Map<String, Object> map) {
        this.map = map;
    }

    protected void removeFileMetadata(String fileID) {
        this.remove(fileID + "_base64");
        this.remove(fileID + "_size");
        this.remove(fileID + "_crc32");
    }

    public void clearFileLoadField(String fileLoadFieldName) {

        Object dataInField = this.get(fileLoadFieldName);
        if (dataInField instanceof FileBean) {
            this.remove(fileLoadFieldName);
            this.removeFileMetadata(fileLoadFieldName);
        } else if (dataInField instanceof List) {
            for (Object obj : (List) dataInField) {
                if (obj instanceof FileBean) {
                    this.removeFileMetadata(((FileBean) obj).getFileID());
                }
            }
            this.remove(fileLoadFieldName);
        }
    }

    public void clearForOrdering() {};

    public void fillWithPrivateRoomData(IPrivateRoomDataContainer privateRoomDataContainer) {};

    @Override
    public int size() {
        return this.map.size();
    }

    @Override
    public boolean isEmpty() {
        return this.map.isEmpty();
    }

    @Override
    public boolean containsKey(Object key) {
        return this.map.containsKey(key);
    }

    @Override
    public boolean containsValue(Object value) {
        return this.map.containsValue(value);
    }

    @Override
    public Object get(Object key) {
        return this.map.get(key);
    }

    @Override
    public Object put(String key, Object value) {
        return this.map.put(key, value);
    }

    @Override
    public Object remove(Object key) {
        return this.map.remove(key);
    }

    @Override
    public void putAll(Map<? extends String, ? extends Object> m) {
        this.map.putAll(m);
    }

    @Override
    public void clear() {
        this.map.clear();
    }

    @Override
    public Set<String> keySet() {
        return this.map.keySet();
    }

    @Override
    public Collection<Object> values() {
        return this.map.values();
    }

    @Override
    public Set<Entry<String, Object>> entrySet() {
        return this.map.entrySet();
    }
}
