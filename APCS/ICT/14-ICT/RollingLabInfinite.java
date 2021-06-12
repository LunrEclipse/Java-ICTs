public class RollingLabInfinite
{
    public static void main(String[] args)
    {
        int count = 0;
        while(count <= 30)
        {
        count = 0;
        int one = 0;
        int two = 0;
        int three = 0;
        
        while (  (one == two) || (two == three) || (one == three) )
        {
            one = (int)(Math.random()*6) + 1;
            two = (int)(Math.random()*6) + 1;
            three = (int)(Math.random()*6) + 1;
            count++;
            System.out.println(one + "   " + two + "   " + three + "   ");
        }
        System.out.println("count  =  " + count);
    }
    }
}