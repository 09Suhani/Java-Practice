interface face1
{
void disp(int a,int b);
void show(string s,int n);
}
class Para implements face1
{
void disp(int a,int b)
{
if(a>b)
System.out.print("a is larger");
else
System.out.print("b is large");
}
void show(String s, int n)
{
for(int i=0; i<n; i++)
System.out.print(s);
}
public static void main(String arg[])
{
Para ob=new Para();
ob.disp(2,3);
ob.show("Ashok",5);
}
}
