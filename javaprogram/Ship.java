class Ship
{
int a,b,c;
Ship(int a,int b)
{
this.a=a;
this.b=b;
}
void sum()
{
c=a+b;
System.out.print("Total="+c);
}
public static void main(String arg[])
{
Ship ot=new Ship();
   ot.sum();
}
}