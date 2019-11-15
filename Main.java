
/**
 * Write a description of class forExamples here.
 *
 * @author Mr. Burger
 * @version 10/15/19
 */
public class Main
{
    public static void main(String[] args)
    {
       //while loop - Good for not knowing hom many times we need the loop to run
        int count = 1;
        while (count <=100)
        {
            System.out.print(count +"\t");
            if(count%10==0)
                System.out.println();
            count++;
        }
        System.out.println("=========================================================");
        //for loop example
        for(int i=0;i<=50;i+=2)
        {
            System.out.print(i +"\t");
            if(i%10==0)
                System.out.println();
        }
        System.out.println("==========================================================");
        //nested for loop
        for(int row = 0;row <= 10; row++)
        {
            for(int col = 0; col <=10; col++)
            {
               System.out.print(row+col+"\t");
            }
            System.out.println();
        }

    }
}
