package com.example.weather.utils;

import java.text.Normalizer;
import java.util.regex.Pattern;

public final class StringUtils {
    public static String removeAccent(String s){
        String result = Normalizer.normalize(s, Normalizer.Form.NFD);
        Pattern pattern = Pattern.compile("\\p{InCOMBINING_DIACRITICAL_MARKS}+");
        result = pattern.matcher(result).replaceAll("").replaceAll("Đ","D");
        return result;
    }
}
