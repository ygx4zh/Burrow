package com.example.burrowserver.utils;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.ResourceBundle;

/**
 *
 * @author ygx
 *
 * 资源
 */

public class ResourceUtil {
    // private static ResourceBundle sBundle = ResourceBundle.getBundle("config", Locale.CHINA);
    private static Map<String,String> sBundle = new HashMap<>();
    static {
        sBundle.put("serverHost","10.0.0.10");
        sBundle.put("serverPort","20000");
        sBundle.put("usn","ygx");
        sBundle.put("port","20000");

    }
    public static String get(String key){
        return sBundle.get(key);
    }

}
