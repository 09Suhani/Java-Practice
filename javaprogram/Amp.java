interface Face1
{
void disp();
}
interface Face2
{
void show();
}
class Amp implements Face1,Face2
{
public void disp()
{
System.out.print("hello");
}
public void show()
{
System.out.print("hi");
}
void india()
{
System.out.print("welcome");
}
}
public static void main(String arg[])
{
Amp ot=new Amp();
ot.disp();
ot.show();
ot.india();
}
}