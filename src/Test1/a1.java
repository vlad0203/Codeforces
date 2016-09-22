package Test1;

import java.util.*;

/**
 * Created by vlad on 29.02.16.
 */
public class a1 {


    public static void main(String[] args) {
        int n,m,a;
        Scanner scanner = new Scanner(System.in);
        n=scanner.nextInt();
        m=scanner.nextInt();
        a=scanner.nextInt();
        System.out.println((long)((n+a-1)/a)*((m+a-1)/a));

    }


}
