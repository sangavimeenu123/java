import java.io.*;
import java.util.*;
class Lcp
{
public static void main(String[] args)
{
Scanner s=new Scanner(System.in);
int a=s.nextInt();
int minimum=100000;
int leng,g=1,d=0;
String str=s.nextLine();
String A[]=new String[a];
for(int i=0;i<a;i++)
{
A[i]=s.nextLine();
leng=A[i].length();
if(leng<minimum)
{
minimum=leng;
}
}
for(int i=0;i<=minimum-1;i++)
{
for(int j=0;j<=a-2;j++)
{
if(A[j].charAt(i)==A[j+1].charAt(i))
continue;
else
{
g=0;
break;
}
}
if(g==1)
{
d++;
System.out.print(A[0].charAt(i));
}
else
break;
}
if(d==0)
System.out.println("");
}
}
