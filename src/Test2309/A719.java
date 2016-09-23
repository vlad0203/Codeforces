package Test2309;

import java.util.Scanner;

/**
 * Created by Vlad on 23.09.2016.
 */
public class A719 {

    public static void result(int[] arr, int n){

        if(arr[n-1]==1) System.out.println("UP");
        else if(arr[n-1]==15) System.out.println("DOWN");
        else if(n==1) System.out.println(-1);
        else if(arr[n-2]>arr[n-1]) System.out.println("DOWN");
        else if(arr[n-2]<arr[n-1]) System.out.println("UP");

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        result(arr,n);
    }
    
}
