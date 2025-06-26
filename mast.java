class funt extends Thread
{
public void run()
{
for(int i=1;i<=10;i++)
{
System.out.println("Run a1:"+i);
}
}
}


class submast extends Thread
{
public void run()
{
for(int i=1;i<=10;i++)
{
System.out.println("run a2:"+i);
}
}
}
class mast
{
public static void main(String[]args)
{
funt a1=new funt();
submast a2=new submast();
a1.start();
a2.start();
}
}