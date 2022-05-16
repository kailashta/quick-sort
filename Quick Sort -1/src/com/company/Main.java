package com.company;

import java.util.Scanner;
class Sort{
    public void quickSort(int numbers[],int low,int high){
        if(low < high){
            int pivot = partition(numbers,low,high);
            quickSort(numbers,low,pivot-1);
            quickSort(numbers,pivot+1,high);

        }
    }
    public int partition(int numbers[],int low,int high){
        int pivot = numbers[high];
        int i= low-1;
        for(int j=low;j<high;j++){
            if(numbers[j] <= pivot){
                i++;
                int temp = numbers[i];
                numbers[i] = numbers[j];
                numbers[j] = temp;
            }
        }
        int temp = numbers[i+1];
        numbers[i+1] = numbers[high];
        numbers[high] = temp;
        return i+1;

    }
}
public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of Array");
        int n = sc.nextInt();
        int[] numbers = new int[n];
        for(int i=0;i<n;i++){
            numbers[i]  =sc.nextInt();
        }
        Sort st = new Sort();
        st.quickSort(numbers,0,n-1);
        for(int q:numbers){
            System.out.println(q);
        }

    }
}
