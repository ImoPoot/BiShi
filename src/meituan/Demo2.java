package meituan;

import java.util.Scanner;

public class Demo2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        char[] array=str.toCharArray();
        int num=0;
        for(int i=0;i<array.length;i++)
        {
            if(array[i]>='A'&&array[i]<='Z')
                num++;
        }
        System.out.println(Math.abs(array.length/2-num));
    }
}
