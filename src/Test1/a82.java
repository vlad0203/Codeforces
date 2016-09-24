package Test1;

import java.util.Scanner;

/**
 * Created by vlad on 05.03.16.
 */
public class a82 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long x = sc.nextLong();
        boolean j=true;
        long k=5;

        while(j)
        {
            if(x>k){x-=k;k*=2;}
            else break;
        }
        k/=5;
        long a1=x/k;

        if(a1==0)
        {
            System.out.println("Leonard");
        }
        else if(a1==1)
        {
            System.out.println("Penny");
        }
        else if(a1==2)
        {
            System.out.println("Rajesh");
        }
        else if(a1==3)
        {
            System.out.println("Howard");
        }
        else if(a1==4)
        {
            System.out.println("Sheldon");
        }
    }

}
