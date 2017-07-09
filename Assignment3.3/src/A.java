
 class X
{
    public X()
    {
        System.out.println("X1");
    }
}
class B extends X
{
    public B()
            
    {
        this(4);
        System.out.println("B1");
    }
    public B(int k)
    {
        System.out.println("B2");
    }
}
public class A
{
    public static void main(String args[])
    {
        B o1=new B();
        
    }
}

   
   
    

