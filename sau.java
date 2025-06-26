interface i1
{
int x=10;
void f1();
}

interface i2 extends i1
{
int y=20;
public void f2();
}

class c1 implements i2
{
public void f1()
{

}
public void f2()
{
  
}
}

class sau
{
public static void main(String[]args)
{
c1 a1=new c1();
a1.f3();
System.out.println(a1.x);
}
}