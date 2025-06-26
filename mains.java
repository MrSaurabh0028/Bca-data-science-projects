package pak2;
abstract class prim
{
void f1()
{
System.out.println("print 1st numb");
}
abstract void f2();
}

class subc extends prim
{
void f3()
{
super.f1();
System.out.println("hello a");
}
void f2()
{

}
}
class mains
{
public static void main(String[]args)
{
subc a1=new subc();
a1.f3();
}
}