package Test1;

import java.util.Scanner;

/**
 * Created by vlad on 05.03.16.
 */
public class a110 {

    public static int numberOfHappyNumbers(String number)
    {
        String s = number;
        int counter=0;
        for(int j=0;j<s.length();j++)
        {
            if((s.charAt(j)=='4')||(s.charAt(j)=='7'))
            counter++;
        }
        return counter;
    }
    public static boolean isHappyNumber(int number)
    {
        Integer i = number;
        String s = i.toString();
        if((s.contains("1"))||(s.contains("2"))||(s.contains("3"))||(s.contains("5"))
                ||(s.contains("6"))||(s.contains("8"))||(s.contains("9"))||(s.contains("0")))
        {
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String number = sc.next();
        if(isHappyNumber(numberOfHappyNumbers(number)))
        {
            System.out.println("YES");
        }
        else
        System.out.println("NO");
    }

}
