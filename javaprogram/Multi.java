//Multilevel Inheritance with constructor

class One
{
int x;
One(int a)
{
x=a;
}
void disp()
{
System.out.println("Value of a="+x);
}}
class Two extends One
{
int y;
Two(int a,int b)
{
super(a);
y=b;
}
void show()
{
System.out.println("Value of b="+y);
}}
class Three extends Two
{
int z;
Three(int a,int b,int c)
{
super(a,b);
z=c;
}
void myshow()
{
System.out.println("Value of c="+z);
}}
class Multi
{
public static void main(String []args)
{
Three ot=new Three(3,2,5);
ot.disp();
ot.show();
ot.myshow();
}
}