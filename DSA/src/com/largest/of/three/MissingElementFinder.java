package com.largest.of.three;

import java.util.HashSet;

public class MissingElementFinder {
    public static int findMissingElement(int[] arr) {
        HashSet<Integer> hashSet = new HashSet<>();
        
        // Add all elements of the array to the hash set
        for (int num : arr) {
            hashSet.add(num);
        }
        
        // Iterate from 1 to n (assuming elements are from 1 to n)
        for (int i = 1; i <= arr.length + 1; i++) {
            // If current number doesn't exist in the hash set, it's the missing element
            if (!hashSet.contains(i)) {
                return i;
            }
        }
        
        // If no missing element found, return -1 or any other suitable value
        return -1;
    }
    
    public static void main(String[] args) {
        int[] arr = {1, 2, 3,4, 5,6,7,8,10}; // Example array with one missing element
        int missingElement = findMissingElement(arr);
        System.out.println("Missing element is: " + missingElement);
    }
}

