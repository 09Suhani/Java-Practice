//Instance and Class Variable

class Mydata
{
int a=10; //instance variable
static int b=20;
public static void main(String []arg)
{

Mydata x=new Mydata(); //a=10
Mydata y=new Mydata(); //a=10
x.a=x.a+5;
x.b=x.b+5;

System.out.println("x Object="+x.a); //a=15
System.out.println("y Object="+y.a); //a=10

System.out.println("x Object class var="+x.b); //b=25
System.out.println("y Object class var="+y.b); //b=25

}
}