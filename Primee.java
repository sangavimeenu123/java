import java.util.*;
class Primee
{
public static void main(String args[])
{
int a,b,i,n;
Scanner s=new Scanner(System.in);
System.out.println("Enter the number:");
a=s.nextInt();
System.out.println("Enter the number:");
b=s.nextInt();
while(a<b)
{
n=0;
for(i=2;i<=a/2;i++)
{
if(a%i==0)
{
n=1;
break;
}
}
if(n==0)
System.out.println(a);
a++;
}
}
}
