import java.io.*;
import java.util.*;
class Pangram
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("enter the string:");
String s=sc.nextLine();
if(  (s.contains("a")||s.contains("A")) &&(s.contains("b")||s.contains("B")) && (s.contains("c")||s.contains("C")) &&

(s.contains("d")||s.contains("D")) &&(s.contains("e")||s.contains("E")) &&(s.contains("f")||s.contains("F")) &&(s.contains

("g")||s.contains("G")) &&(s.contains("h")||s.contains("H")) &&(s.contains("i")||s.contains("I")) &&(s.contains("j")||

s.contains("J")) &&(s.contains("k")||s.contains("K")) &&(s.contains("l")||s.contains("L")) &&(s.contains("m")||s.contains

("M")) &&(s.contains("n")||s.contains("M")) &&(s.contains("n")||s.contains("N")) &&(s.contains("o")||s.contains("O")) &&

(s.contains("p")||s.contains("P")) &&(s.contains("q")||s.contains("Q")) &&(s.contains("r")||s.contains("R")) &&(s.contains

("s")||s.contains("S")) &&(s.contains("t")||s.contains("T")) &&(s.contains("u")||s.contains("U")) &&(s.contains("v")||

s.contains("V")) &&(s.contains("W")||s.contains("w")) &&(s.contains("x")||s.contains("X")) &&(s.contains("Y")||s.contains

("y")) && (s.contains("z")||s.contains("Z")) )
{
System.out.println("yes");
}
else
{
System.out.println("no");
}
}
}
