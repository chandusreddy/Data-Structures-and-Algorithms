package com.chandu.datastructures.others;

import java.util.HashMap;

public class PairsthatSumup {
	
	
	public static void printPairs(int[] arr, int sum) {
        HashMap<Integer, Integer> map = new HashMap<>();
        //Pass 1: Fill the map with keys and values
        for (int i = 0; i < arr.length; i++) {
            map.put(arr[i], i);
        }
        
        //Pass 2: Compare using sum difference -> containsKey(sum - arr[j]) && map.get(key) != j
        for (int j = 0; j < arr.length; j++) {
            if (map.containsKey(sum - arr[j]) && map.get(sum - arr[j]) != j) {
                System.out.println("Pair: " + arr[j] + ", " + arr[map.get(sum - arr[j])]);
            }
        }
}

}
