class Box
{
int a;
Box()
{
a=10;
}
void disp(Box ob)
{
ob.a=ob.a+5;
}
public static void main(String []args)
{
Box ot=new Box();
System.out.print("value="+ot.a);    //10
ot.disp(ot);
System.out.print("value="+ob.a);
}
}