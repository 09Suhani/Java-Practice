import java.util.Scanner;
class Five
{
public static void main(String arg[])
{
int a,b;
Scanner ob=new Scanner(System.in);
System.out.print("Enter the number");
a=ob.nextInt();
System.out.print("Enter the number");
b=ob.nextInt();
if(a%5==0 && b%5==0)
System.out.print("Divisible");
else
System.out.print("Not divisible");
}
}