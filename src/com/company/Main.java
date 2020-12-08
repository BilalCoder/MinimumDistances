package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();
        int[] arr = new int[len];
        for (int i=0; i<len; i++){
            arr[i] = sc.nextInt();
        }
        int min = 1000;
        for (int i=0; i<len; i++){
            for (int j=i+1; j<len; j++){
               if(arr[i]==arr[j] && Math.abs(i-j)<min){
                   min = Math.abs(i-j);
               }
            }
        }
        if(min!=1000)
            System.out.println(min);
        else
            System.out.println("-1");
    }
}
