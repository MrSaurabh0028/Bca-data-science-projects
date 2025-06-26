abstract class Demo1
{
int x,y;
void f1()		
{
x=5;
y=10;
}
abstract void f2(); // abstract function or abstract can't be make object/instentations.
}

class Demo2 extends Demo1
{
int z;
void f3()
{
super.f1();
z=15;
}
void f2()  //override 
{

}
}
class abs
{
public static void main(String[]args)
{
Demo2 a1=new Demo2();
a1.f3();
System.out.println(a1.z);
System.out.println(a1.x);
System.out.println(a1.y);
}
}