package com.muthu;

import java.util.Arrays;

public class Cap{
	
	public boolean checkIsogram(String inputString)
    {
       
        inputString = inputString.toLowerCase();
        int stringLength = inputString.length();
 
        char characterArray[] = inputString.toCharArray();
        
        Arrays.sort(characterArray);
        for (int i = 0; i < stringLength - 1; i++) {
            if (characterArray[i] == characterArray[i + 1])
                return false;
        }
        return true;
    }
	
}