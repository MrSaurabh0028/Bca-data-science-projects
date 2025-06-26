interface vivo
{
public void f1();	//public se function banaoo.
}

class oppo implements vivo
{
public void f1()	//public se function banaoo.
{
System.out.println("process1.");
}
}

class interf
{
public static void main(String[]args)
{
oppo a1=new oppo();
a1.f1();
}
}