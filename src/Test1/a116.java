package Test1;

import java.util.Scanner;

/**
 * Created by vlad on 01.03.16.
 */
public class a116 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int []a=new int[n];
        int []b=new int[n];
        for (int i = 0;i<n;i++)
        {
            a[i]=sc.nextInt();
            b[i]=sc.nextInt();
        }
        int []moment=new int[n];
        moment[0]=b[0];
        for (int i = 1;i<n;i++)
        {
            moment[i]=moment[i-1]-a[i]+b[i];
        }
        int maxMomentIndex=0;
        for (int i = 1;i<n;i++)
        {
            if(moment[maxMomentIndex]<moment[i])
            {
                maxMomentIndex=i;
            }
        }
        System.out.println(moment[maxMomentIndex]);
    }

}
