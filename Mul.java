import java.io.*;
import java.util.*;
class Mul
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the number:");
int n=sc.nextInt();
int a=0;
for(int i=1;i<=5;i++)
{
a=n*i;
System.out.print(a+" ");
}
}
}
