import java.io.*;
import java.util.Scanner;
class AP{
public static void main(String[] args)
{
Scanner input = new Scanner(System.in);
int n = 0;
int sum= 0;
int term = 0;
int no = input.nextInt();
int f = input.nextInt();
int d= input.nextInt();
n = f + (no - 1) * d;
sum = no * (2 * f + (no - 1) * d)/2; 
for(int i = 0; i < no; i++){
term = f + i * d;
}
System.out.println(sum);
}
}
