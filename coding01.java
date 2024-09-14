// Jack has an array A of length N. He wants to label whether the number in the array is even or odd.
//  Your task is to help him find and return a string with labels even or odd in sequence according to which the numbers appear in the array.

// Input Specification:
// input1: An integer array A, representing the array of numbers
// input2: A integer N, representing the length of array

// Output Specification:
// Return a string with labels even or odd in sequence according to which the numbers appear in the array.

import java.util.Scanner;

public class coding01{
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);             
        System.out.print("enter the size of arr:- ");
        int n = scan.nextInt();
        int [] arr=new int[n]; 
        System.out.print("enter the element:- ");
        for (int i = 0; i < arr.length; i++) {
            arr[i]=scan.nextInt(); 
            
        }
                                 
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] % 2 ==0) System.out.print("Even  ");
            
         else{  
            System.out.print("Odd  ");
      }
 
    } 
  }
}