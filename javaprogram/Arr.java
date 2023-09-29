import java.util.Scanner;
class Arr
{
public static void main(String arg[])
{
String name[]=new String[5];
int i;
String s;
Scanner ob=new Scanner(System.in);
for(i=0;i<=4;i++)
{
System.out.print("Enter name=");
name[i]=ob.next();
}
System.out.print("Enter name to search=");
s=ob.next();
for(i=0;i<4;i++)
{
if(name[i].equals(s))
{
System.out.print("Matched");
break;
}
}
if(i==4)
System.out.print("not matched");
}
}