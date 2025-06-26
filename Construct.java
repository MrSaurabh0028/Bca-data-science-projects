package pak;
class Demo
{
int x,y;
Demo()
{
System.out.println("Construct 1 executed");
}
}



class Construct
{
public static void main(String[]args)
{
Demo a1=new Demo();
Demo a2=new Demo();
}
}