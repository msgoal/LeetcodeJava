package com.example.demo;

public class DividePositivesNegatives {

    public static void main(String[] args) {
        Integer arr[] = {-1,0,0,0,-1,-1,0,-1,-1,0,-1,0,0,0,0,-1,0,-1,-1,-1};
        int j=arr.length-1,i=0;
        System.out.print("Array Length : "+arr.length+" \n");
        while(i != j){

            if(arr[i] == 0)
            {
                i++;continue;
            }
            if(arr[j] == -1)
            {
                j--;continue;
            }

            int t = arr[i];
            arr[i] = arr[j];
            arr[j] = t;

        }
        System.out.print("Array Length after processing : "+arr.length+" \n");
        for(i=0;i<arr.length;i++){
            System.out.print(" "+arr[i]);
        }
    }
}
