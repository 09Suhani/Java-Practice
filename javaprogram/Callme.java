//Inheritance(Simple)

class One
{
 void disp()
 {
 System.out.print("This is base class");
 }
}
class Two extends One
{
 void show()
 {
 System.out.print("This is sub class");
 }
}
class Callme
{
 public static void main(String arg[])
{
 Two ot=new Two();
 ot.show();
 ot.disp();
}
}