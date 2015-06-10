package com.FirstDay;

import java.util.ArrayList;
import java.util.*;

/**
 * Created by Вевдюк on 10.06.2015.
 */
public class DoThis {

    public static <T, E> T getKeyByValue(Map<T, E> map, E value) {
        for (Map.Entry<T, E> entry : map.entrySet()) {
            if (Objects.equals(value, entry.getValue())) {
                return entry.getKey();
            }
        }
        return null;
    }

    public static Character Find( String inputString ){
        Character required=' ';
        char[] stringToCharArray = inputString.toCharArray();
        Map<Character , Integer > checkSum = new HashMap<Character, Integer>();
        for(int i = 0; i < inputString.length(); i++){
            char currentCharacter = stringToCharArray[i];
            if(checkSum.containsKey(currentCharacter)){
                checkSum.put(currentCharacter ,checkSum.get(currentCharacter)+1);
               // System.out.println("Key: \'" + currentCharacter + "\' Value: " + checkSum.get(currentCharacter));
            }
            else{
                checkSum.put(currentCharacter, 1);
            }
        }
        required = getKeyByValue(checkSum, 1);
        return required;
}

}