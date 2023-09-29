import java.util.Scanner;
class Emp
{
int eno;
String n;
float bs;
void accept()
{
Scanner ob=new Scanner(System.in);
System.out.print("enter Eno");
eno=ob.nextInt();
System.out.print("enter Ename");
n=ob.next();
System.out.print("enter salary");
bs=ob.nextFloat();
}
void disp()
{
System.out.println("Emp no="+eno);
System.out.println("Emp name="+n);
System.out.println("Emp salary="+bs);
}
}
class Bonus extends Emp
{
float b;
void calculate()
{
if(b>=50000)
b=(bs*10)/100;
else
b=(bs*5)/100;
System.out.println("Bonus="+b);
}
}
class Money
{
public static void main(String arg[])
{
Bonus tt= new Bonus();
tt.accept();
tt.disp();
tt.calculate();
}
}
