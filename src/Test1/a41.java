package Test1;

import java.util.Scanner;

/**
 * Created by vlad on 07.03.16.
 */
public class a41 {

    public static String reverse(String s)
    {
        String g="";
        g=g.concat(s.substring(s.length()-1));
        for (int i=s.length()-2;i>=0;i--)
        {
            g=g.concat(s.substring(i,i+1));
        }
        return g;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        String output = sc.next();
        String normalOutput = reverse(input);
        if(normalOutput.equals(output))
        {
            System.out.println("YES");
        }
        else System.out.println("NO");

    }

}
