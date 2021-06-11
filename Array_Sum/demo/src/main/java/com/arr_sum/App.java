package com.arr_sum;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static int Arr_Sum(ArrayList<Integer>input){
        int ans = 0;
        for(int a: input){
            ans += a;
        }
        return ans;
    }

    public static void main( String[] args )
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input length of array:");
        int n = Integer.parseInt(sc.nextLine());
        System.out.println("Input numbers:");
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0 ; i < n ; i ++){
            int temp = Integer.parseInt(sc.nextLine());
            list.add(temp);
        }
        System.out.println(Arr_Sum(list));
    }
}
