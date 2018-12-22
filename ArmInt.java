import java.util.*;
class ArmInt
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
System.out.println("Enter the number:");
int n=s.nextInt();
int a=0;
int q,r;
for(int i=0;i<=n;i++)
{
r=n%10;
q=n/10;
a=a+r*r*r;
n=q;
}
if(a!=n)
{
System.out.println("yes");
}
else
{
System.out.println("no");
}
}
}
