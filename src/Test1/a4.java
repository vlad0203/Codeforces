package Test1;

import java.util.Scanner;

/**
 * Created by vlad on 29.02.16.
 */



public class a4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int w = sc.nextInt();
        if(w<=3) System.out.println("NO");
        else if(((w/2)*2)==w)
        {
            System.out.println("YES");
        }
        else
        {
            System.out.println("No");
        }
    }

}
