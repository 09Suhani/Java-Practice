//Anonymous class example

abstract class Pixs
{
abstract void disp();
}
class Mypixs
{
public static void main(String []args)
{
Pixs ob=new Pixs()
{
void disp()
{
System.out.print("Anonymous class...");
}
};
ob.disp();
}
}