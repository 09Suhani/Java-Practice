//Argument

class Argu
{
void sum(int a,int b)
{
 int c;
 c=a+b;
 System.out.print("Result="+c);
}
int add(int a,int b)
{
 int c;
 c=a+b;
 System.out.print("Result="+c);
 return c;
}
public static void main(String arg[])
{
 int x;
 Argu ob=new Argu();
 ob.sum(4,5);
 x=ob.add(3,2);
}
}
