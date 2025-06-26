abstract class vivo
{
int i=10;
void fun1()
{
System.out.println(i+" :i ia print successfully");
System.out.println("fun 01");
}
abstract void fun3();
}

class oppo extends vivo
{
void fun2()
{
super.fun1();
{
System.out.println("fun 02");
System.out.println("fun 03");
}
}
void fun3()
{

}
}

class Abs
{
public static void main(String[]args)
{
oppo a1=new oppo();
a1.fun2();
}
}