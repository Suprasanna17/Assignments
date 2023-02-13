import java.util.*;
public class unique {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        Arrays.sort(arr);
        int len=arr.length;
        int arr1[]=new int[n];
        int ind=0;
        for(int i=0;i<len;i++){
            while(i<len-1 && arr[i]==arr[i+1]){
                i++;
            }
            arr1[ind]=arr[i];
            ind++;
        }
        for(int i=0;i<ind;i++)
            System.out.print(arr1[i]+" ");
         sc.close();  
    }
}
