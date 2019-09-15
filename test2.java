import java.util.Scanner;

class test2
{
    public static void main(String[]args)
    {
        Scanner s=new Scanner(System.in);
        int[] arr=new int[5];
        for(int i=0;i<5;i++)
        {
            arr[i]=s.nextInt();
        }
        for(int i=0;i<5;i++)
        {
            for(int j=0;j<5;j++)
            {
                if(arr[i]>arr[j])
                {
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
                else if(arr[i]<arr[j])
                {
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        int sum=0;
        for(int i=1;i<arr.length-1;i++)
        {
            sum+=arr[i];
        }
        System.out.println("Average of the remaining number is: "+sum/(arr.length-2));
        

    }
}