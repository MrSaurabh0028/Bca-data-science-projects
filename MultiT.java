class MultiT
{
public static void main(String[]args)
{
System.out.println("hello");
try
{
System.out.println(5/0);
}
catch(ArithmeticException e1)
{
System.out.println(e1.getMassage());
}
System.out.println("GM");
}
}
