package com.FirstDay;

import java.util.ArrayList;
import java.util.*;

/**
 * Created by Вевдюк on 10.06.2015.
 */
public class DoThis {

    private static <T, E> T getKeyByValue(Map<T, E> map, E value) {
        for (Map.Entry<T, E> entry : map.entrySet()) {
            if (Objects.equals(value, entry.getValue())) {
                return entry.getKey();
            }
        }
        return null;
    }

    public static Character findRequiredCharacter(String inputString){
        Character required=' ';
        Map<Character, Integer > checkSum = new LinkedHashMap<Character, Integer>();
        for(int i = 0; i < inputString.length(); i++){
            char currentCharacter = inputString.toLowerCase().charAt(i);
            if(checkSum.containsKey(currentCharacter)){
                checkSum.put(currentCharacter, checkSum.get(currentCharacter) + 1);
            }
            else{
                checkSum.put(currentCharacter, 1);
            }
        }
        required = getKeyByValue(checkSum, 1);
        return required;
}

}