interface Face1
{
void disp();
default void show()
{
 System.out.print("This is default function");
}
}
class Top implements Face1
{
public void disp()
{
System.out.print("This is a function from face1");
}
public static void main(String arg[])
{
Top ob=new Top();
ob.disp();
ob.show();
}}