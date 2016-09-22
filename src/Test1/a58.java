package Test1;

import java.util.Scanner;

/**
 * Created by vlad on 05.03.16.
 */
public class a58 {

    public static boolean ishello(String s)
    {
        int j1,j2,j3,j4,j5;
        j1 = s.indexOf('h');
        if(j1!=-1) {
            j2 = s.indexOf('e',j1+1);
            if(j2!=-1) {
                j3 = s.indexOf('l',j2+1);
                if(j3!=-1) {
                    j4 = s.indexOf('l',j3+1);
                    if(j4!=-1) {
                        j5 = s.indexOf('o',j4+1);
                        if(j5!=-1) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        if (ishello(s))
            System.out.println("YES");
        else
            System.out.println("NO");
        }
    }


