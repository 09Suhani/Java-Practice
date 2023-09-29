//Constructor overloading

class C
{
 int a,b,c;
 C()
{
  a=10;
  b=20;
}
C(int x,int y)
{
 a=x;
 b=y;
}
void disp()
{
 c=a+b;
 System.out.print("Result="+c);
}
public static void main(String arg[])
{
 C ob=new C();
 C ot=new C(4,3);
  ob.disp();
  ot.disp();
}
}