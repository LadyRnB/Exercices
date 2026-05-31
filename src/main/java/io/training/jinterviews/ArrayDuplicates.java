package io.training.jinterviews;

import java.util.Arrays;

public class ArrayDuplicates {

    public String[] findDuplicates(String[] array) {
        if(array == null) {
            return null;
        }
        String[] arrayDuplicate = new String[array.length];
        int duplicateCount = 0;
        for(int i= 0; i < array.length; i++){
            for( int j = i + 1; j < array.length; j++){
                if(array[i].equals(array[j])){
                    boolean alreadyFound = false;
                    for( int k = 0; k < duplicateCount; k++){
                       if(arrayDuplicate[k].equals(array[j])){
                           alreadyFound = true;
                           break;
                       }
                    }
                    if(!alreadyFound){
                        arrayDuplicate[duplicateCount] = array[i];
                        duplicateCount++;
                    }
                }
            }
        }
        return Arrays.copyOf(arrayDuplicate, duplicateCount);

    }
}
