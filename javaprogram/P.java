//Method Overloaading

class P
{
 void sum(int a,int b)
{
 int s;
 s=a+b;
System.out.print("sum="+s);
}
void sum(int a,int b,int c)
{
 int s;
 s=a+b+c;
System.out.print("sum="+s);
}
public static void main(String arg[])
{
 P ob=new P();
  ob.sum(2,3);
  ob.sum(4,5,6);
}
}