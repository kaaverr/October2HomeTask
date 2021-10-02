package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static int[] getZeros(int[] array){
        return array;
    }
    public static void main(String[] args) {
	// [7, 12, 5, 0, 4, 0, 5]
	// [7, 12, 5, 4, 5, 0, 0]  має бути так
        int[] array = new int[]{
                7, 12, 5, 0, 4, 0, 5
        };
        System.out.println(Arrays.toString(getZeros(array)));

        List<Integer> list = new ArrayList<>(array);

    }
}
