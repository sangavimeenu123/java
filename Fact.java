import java.io.*;
import java.util.*;
class Fact
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int f=1;
System.out.println("Enter the number:");
int n=sc.nextInt();
for(int i=1;i<=n;i++)
{
f=f*i;
}
System.out.println("the factorial of the number is:"+f);
}
}
