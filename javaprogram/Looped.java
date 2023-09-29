import java.util.Scanner;
class Looped
{
public static void main(String arg[])
{
int i,j;
Scanner ob=new Scanner(System.in);
System.out.print("Enter the number");
   i=ob.nextInt();
for(i=1; i<=5; i++)
{
 for(j=1; j<=i; j++)
{
 System.out.print(j+"");
}
 System.out.println();
}
}
}