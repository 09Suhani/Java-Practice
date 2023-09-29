import java.util.Scanner;
class Numb
{
 public static void main(String arg[])
 {
   int a,e=0,od=0,i;
 Scanner ob=new Scanner(System.in);
 for(i=0; i<=9; i++)
 {
  System.out.print("Enter the Number");
   a=ob.nextInt();
  if(a%2==0)
   e=e+a;
  else
   od=od+a;
 }
System.out.print("Sum of even="+e);
System.out.print("Sum of odd="+od);
 }
}