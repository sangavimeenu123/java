import java.util.*;
class Even
{
public static void main(String args[])
{
int a,b,c,d;
Scanner s=new Scanner(System.in);
System.out.println("enter the value:");
a=s.nextInt();
System.out.println("enter the value:");
b=s.nextInt();
if((a+b)%2==1)
{
c=b-1;
d=a+2;
System.out.println("even numbers are:"+c " " +d);
}
else
{
c=b-2;
d=a+2;
System.out.println("even numbers are:"+c " " +d);
}
}
}
