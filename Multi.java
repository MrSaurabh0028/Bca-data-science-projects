class process1
{
void f1()
{
for(int i=1;i<=20;i++)
{
System.out.println("process:"+i);
}
}

class Multi
{
public static void main(String[]args)
{
process1 a1=new process1();
a1.f1();
}
}