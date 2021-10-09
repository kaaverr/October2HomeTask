package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static int[] getZeros(int[] array){
        int[] arrayOut = new int[array.length];
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < array.length; i++) {
            if(array[i] != 0){
                list.add(array[i]);
            }
        }
        for (int i = 0; i < list.size(); i++) {
            arrayOut[i] = list.get(i);
        }
        System.out.println(list);
        return arrayOut;
    }
    public static void main(String[] args) {
	// [7, 12, 5, 0, 4, 0, 5]
	// [7, 12, 5, 4, 5, 0, 0]  має бути так
        int[] array = new int[]{
                7, 12, 5, 0, 4, 0, 5
        };
        System.out.println(Arrays.toString(getZeros(array)));

    }
}
