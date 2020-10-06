package com.company;

public class Tp4 {

    public static int moula(int sortedArray[], int search ){
       int high = sortedArray.length;
       int low = 0;
       int index = -1;

       while (low <= high){
           int mid = (low + high)/2;
           if (sortedArray[mid] < search){
               low = mid +1;
           }else if (sortedArray[mid] > search){
               high = mid - 1;
           }else if (sortedArray[mid] == search){
               index = mid;
               break;
           }
       }
       return index;
    }

    public static void main(String[] args) {

        int scores[] = {1,2,3,4,5,6,7};
        System.out.println(moula(scores, 23));

    }


}
