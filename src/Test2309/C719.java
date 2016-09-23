package Test2309;

import java.util.Scanner;
import java.util.zip.CheckedInputStream;

/**
 * Created by Vlad on 23.09.2016.
 */
public class C719 {

    public  static int arrLen(int arr[]){
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==0){return i;}
        }
        return arr.length;
    }


    public static String round(String s, int dot, int t){
        int normposarray[] = new int[s.length()];
        int iterarray = 0;
        int itert = 0;
        for (int i = dot+1; (i < s.length())&&(itert < t); i++) {
            if(s.charAt(i)>52){
                normposarray[iterarray++]=i;
                itert++;
            }
        }


        int pos;

        if(t>arrLen(normposarray))
        {
            pos = arrLen(normposarray)-1;
        }
        else
        {
            pos = normposarray[t-1];
        }

        String s1 = s.substring(0,pos-1) +Character.toString((char)(s.charAt(pos-1)+1));
        return s1;

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int t = scanner.nextInt();
        String s = scanner.next();
        int dotposition = s.indexOf('.');


        String s1 = round(s, dotposition, t);
    }

}
