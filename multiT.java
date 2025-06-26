class process1 implements Runnable
{
public void run()
{
for(int i=1;i<=20;i++)
{
System.out.println("Process1:"+i);
}
}
}

class process2 implements Runnable
{
int i;
public void run()
{
for(i=1;i<=20;i++)
{
System.out.println("Process2:"+i);
}
}
}

class multiT
{
public static void main(String[]args)
{
process1 a1=new process1();
process2 a2=new process2();
Thread c1=new Thread(a1);
Thread c2=new Thread(a2);
c1.start();
c2.start();

}
}