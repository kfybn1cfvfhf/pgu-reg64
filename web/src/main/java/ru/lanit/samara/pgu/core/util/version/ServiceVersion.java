package ru.lanit.samara.pgu.core.util.version;

import org.json.JSONException;
import org.json.JSONObject;

import java.util.Map;
import java.util.TreeMap;

// Реализация версий услуг refs 5328

public class ServiceVersion {

    private static Map<String, String> versions = new TreeMap<String, String>();

    public static void setVersion(String svc, String version) {
        versions.put(svc, version);
    }

    public static String getVersion(String svc) {
        return versions.get(svc);
    }

    public static Map<String, String> getMap() {
        
        return versions;
    }

    public static String getVersionsAsJson() {
        JSONObject jsonObject = new JSONObject(versions);
        return jsonObject.toString();
    }

    public static String getFilteredVersionsAsJson(String[] svc) {
        JSONObject jsonObject = new JSONObject();
        for (String serviceId : svc) {
            try {
                if (versions.containsKey(serviceId)) {
                    jsonObject.put(serviceId, versions.get(serviceId));
                }
                else {
                    jsonObject.put(serviceId, "Svc not found");
                }
            } catch (JSONException e) {
                return "[]";
            }
        }
        return jsonObject.toString();
    }
}
