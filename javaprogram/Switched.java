import java.util.Scanner;
class Switched
{
public static void main(String arg[])
{
int a;
Scanner ob=new Scanner(System.in);
System.out.print("Enter the no.");
a=ob.nextInt();
switch(a)
{
case 1:
System.out.print("Excellent");
break;
case 2:
System.out.print("Good");
break;
case 3:
System.out.print("Poor");
break;
default:
System.out.print("Nalayak");
}
}
}

