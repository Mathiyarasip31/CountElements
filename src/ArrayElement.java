import java.util.Scanner;

public class ArrayElement {
    public static  int Count(int n,int array[])
    {
        int max=Integer.MIN_VALUE;
        int count=0;
        for(int i=0;i<n;i++)
        {
            if(max<array[i])
            {
                max=array[i];
            }
        }
        for(int i=0;i<n;i++)
        {
            if(max==array[i])
            {
                count++;
            }
        }
        return n-count;
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter size of Array");
        int n= scanner.nextInt();
        System.out.println("Enter elements in an array");
        int array[]=new int[n];
        for(int i=0;i<n;i++)
        {
            array[i]= scanner.nextInt();
        }
        System.out.print("Number of elements that have at least 1 elements greater than itself is : ");
        System.out.println(Count(n,array));
    }
}
//time complexity 2n -0(n)