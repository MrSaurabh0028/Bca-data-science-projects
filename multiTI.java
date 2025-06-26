class process1 extends Thread
{
public void run()
{
for(int i=1;i<=20;i++)
{
System.out.println("process1:"+i);
}
}
}
class process2 extends Thread
{
public void run()
{
for(int i=1;i<=20;i++)
{
System.out.println("process2:"+i);
}
}
}
class multiTI
{
public static void main(String[]args)
{
process1 a1=new process1();
process2 a2=new process2();
a1.start();
a2.start();
}
}