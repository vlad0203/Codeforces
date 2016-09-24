package Test1;

import java.util.Scanner;

/**
 * Created by vlad on 29.02.16.
 */
public class a71{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String word;
        for(int i=0;i<n;i++)
        {
            word=sc.next();
            if(word.length()<=10)
            {
                System.out.println(word);
            }
            else
            {
                System.out.print(word.charAt(0));
                System.out.print((word.length()-2));
                System.out.println(word.charAt(word.length()-1));
            }
        }
    }

}
