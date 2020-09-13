package 猿辅导;

import java.util.Scanner;
import java.util.Stack;

public class demo2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        sc.nextLine();
        for(int i=0;i<t;i++)
        {
            String s=sc.nextLine();
            boolean wrong=false;
            Stack<String> stack=new Stack<>();
            for(int j=0;j<s.length();j++)
            {
                char c=s.charAt(j);
                if(c==' ')
                    continue;
                if(c==')')
                {
                    int x=Integer.parseInt(stack.pop());
                    int y=Integer.parseInt(stack.pop());
                    String temp=stack.pop();
                    if((!temp.equals("+"))&&(!temp.equals("-"))&&(!temp.equals("*")))
                    {
                        wrong=true;
                        break;
                    }
                    else {
                        int result=0;
                        if(temp.equals("+"))
                        {
                            result=y+x;
                        }
                        else if(temp.equals("-"))
                        {
                            result=y-x;
                        }
                        else {
                            result=y*x;
                        }
                        if(stack.isEmpty()||!stack.pop().equals("("))
                        {
                            wrong=true;
                            break;
                        }
                        stack.push(result+"");
                    }
                }
                else {
                    stack.push(c+"");
                }
            }
            if(wrong)
                System.out.println("invalid");
            else {
                System.out.println((Integer.parseInt(stack.pop())%10000000+10000000)%10000000);
            }
        }
    }
}
