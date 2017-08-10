package com.project_restaurant.dao.utils;

/**
 * Created by xuero on 2017/8/1.
 */
public class StringUtil {
    public static boolean isStringArrayContain(String[] array, String target){
        for (String s : array){
            if (s.equals(target)){
                return true;
            }
        }
        return false;
    }

}
