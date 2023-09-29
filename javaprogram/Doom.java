import java.util.Scanner;
class Doom
{
public static void main(String arg[])
{
 int n,s=0,a=0,b;
Scanner ob=new Scanner(System.in);
System.out.print("Enter the no.");
n=ob.nextInt();
do
{
System.out.print("Enter the no.");
b=ob.nextInt();
  if(b%2==1)
   s=s+b;
   a++;

}
while(a<=n);
System.out.print("Sum of Odd="+s);
}
}