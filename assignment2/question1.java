import java.util.Scanner;
public class question1 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the number of elements in the array: ");
    int n = sc.nextInt();
    int[] arr = new int[n];
    System.out.println("Enter the elements of the array: ");
    for (int i = 0; i < n; i++) {
      arr[i] = sc.nextInt();
    }
    for (int i = 1; i < n; i++) {
      arr[i] += arr[i - 1];
    }
    System.out.println("The cumulative sum array is: ");
    for (int i = 0; i < n; i++) {
      System.out.print(arr[i] + " ");
    }
    System.out.println();
    sc.close();  
}
}

