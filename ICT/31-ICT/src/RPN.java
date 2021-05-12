import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class RPN {

    private Stack<Integer> stk;
    private Queue<String> que;

    public RPN()
    {
        stk = new Stack<Integer>();
        que = new LinkedList<String>();
    }

    public void multiplication(String choice)
    {
        int num2 = Integer.MAX_VALUE;
        int num1 = -1;
        try {
            num2 = stk.pop();
            num1 = stk.pop();
            stk.push(num1 * num2);
            que.add(choice);
        }
        catch(Exception e)
        {
            if(num2 != Integer.MAX_VALUE)
                stk.add(num2);
            System.out.println("\nMust be at Least 2 Numbers to Operate\n");
        }
    }

    public void subtraction(String choice)
    {
        int num2 = Integer.MAX_VALUE;
        int num1 = -1;
        try {
            num2 = stk.pop();
            num1 = stk.pop();
            stk.push(num1 - num2);
            que.add(choice);
        }
        catch(Exception e)
        {
            if(num2 != Integer.MAX_VALUE)
                stk.add(num2);
            System.out.println("\nMust be at Least 2 Numbers to Operate\n");
        }
    }

    public void addition(String choice)
    {
        int num2 = Integer.MAX_VALUE;
        int num1 = -1;
        try {
            num2 = stk.pop();
            num1 = stk.pop();
            stk.push(num1 + num2);
            que.add(choice);
        }
        catch(Exception e)
        {
            if(num2 != Integer.MAX_VALUE)
                stk.add(num2);
            System.out.println("\nMust be at Least 2 Numbers to Operate\n");
        }
    }

    public void division(String choice)
    {
        int num2 = Integer.MAX_VALUE;
        int num1 = -1;
        try {
            num2 = stk.pop();
            num1 = stk.pop();
            //if(num2 == 0)
            //{
            //System.out.println("Divison By 0 Not Possible, Enter Another Number");
            //stk.add(num1);
            //stk.add(num2);
            //}
            //else {
            stk.push(num1 / num2);
            que.add(choice);
            //}
        }
        catch(Exception e)
        {
            if(num2 != Integer.MAX_VALUE)
                stk.add(num2);
            System.out.println("\nMust be at Least 2 Numbers to Operate\n");
        }
    }

    public void addNum(String choice)
    {
        try {
            stk.add(Integer.parseInt(choice));
            que.add(choice);
        }
        catch(Exception e)
        {
            System.out.println("\nEnter A Valid Number or Operator\n");
        }
    }

    public void printRes()
    {
        System.out.println("\nFinal Result\n");

        while(!que.isEmpty())
        {
            System.out.print(que.remove() + " ");
        }
        if(!stk.isEmpty())
        {
            System.out.print("= " + stk.pop() + "\n\n");
        }
    }

    public void run()
    {
        stk = new Stack<Integer>();
        que = new LinkedList<String>();
        String choice;
        Scanner console = new Scanner(System.in);
        System.out.print("Enter a Number or Operator (Q to end current run, stop to terminate program) --> ");
        choice = console.nextLine();
        while(!choice.equals("Q") && !choice.equals("q") && !choice.equals("stop"))
        {
            if(choice.equals("*"))
            {
                multiplication(choice);
            }
            else if(choice.equals("-"))
            {
                subtraction(choice);
            }
            else if(choice.equals("+"))
            {
                addition(choice);
            }
            else if(choice.equals("/"))
            {
                division(choice);
            }
            else
            {
                addNum(choice);
            }
            System.out.print("Enter a Number or Operator (Q to end current run, stop to terminate program) --> ");
            choice = console.nextLine();
        }
        printRes();
        if(!choice.equals("stop"))
            run();
    }

}
