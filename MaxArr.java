import java.io.*;
import java.util.*;
class MaxArr
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int n;
System.out.println("Enter the size of an array:");
n=sc.nextInt();
System.out.println("Enter the inputs:");
int a[]=new int[n];
for(int i=0;i<n;i++)
{
a[i]=sc.nextInt();
}
int max=a[0];
for(int i=0;i<n;i++)
{
if(a[i]>max)
{
max=a[i];
}
}
System.out.println("Maximum number in array is:"+max);
}
}
