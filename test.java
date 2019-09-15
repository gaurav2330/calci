public class test
{
    static int amount=1000;
    test()
    {
        System.out.println("amount= "+amount);
    }
    test(int a)
    {
        test.amount+=a;
        
    }
    void display()
    {
        System.out.println("amount= "+amount);
    }
    public static void main(String[]args)
    {
        test t1=new test();
        test t2=new test(2000);
        t2.display();
        test t3=new test(400);
        
        t3.display();
    }
}