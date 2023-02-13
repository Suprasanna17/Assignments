import java.util.Scanner;
class missingnumbers{
public static void printmissingelements(int arr[])
{
    int n=arr.length;
    int d = arr[0] - 0;
    for(int i = 0; i < n; i++)
    {
        if (arr[i] - i!= d)
        {
            while (d<arr[i]-i)
            {
                System.out.print((i + d) + " ");
                d++;
            }
        }
    }
}
public static void main (String[] args)
{     
Scanner sc=new Scanner(System.in);
int N=sc.nextInt();
int arr1[]=new int[N];
for(int i=0;i<N;i++){
    arr1[i]=sc.nextInt();
}
sc.close();
    printmissingelements(arr1);
}
}
