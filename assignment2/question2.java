import java.util.*;
class Node {
    int data;
    Node next;
    Node(int data) {
        this.data = data;
        this.next = null;
    }
}
class LinkedList {
    Node head;
    LinkedList() {
        head = null;
    }
    void insert(int data) {
        Node node = new Node(data);
        node.next = head;
        head = node;
    }
    void merge(LinkedList list2) {
        Node temp = this.head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = list2.head;
    }
    void sort() {
        Node temp = head;
        int count = 0;
        while (temp != null) {
            count++;
            temp = temp.next;
        }
        int[] arr = new int[count];
        temp = head;
        count = 0;
        while (temp != null) {
            arr[count++] = temp.data;
            temp = temp.next;
        }
        Arrays.sort(arr);
        temp = head;
        count = 0;
        while (temp != null) {
            temp.data = arr[count++];
            temp = temp.next;
        }
    }
    void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
}

public class question2{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        LinkedList list1 = new LinkedList();
        System.out.println("Enter the number of elements in List 1:");
        int n1 = sc.nextInt();
        System.out.println("Enter the elements of List 1:");
        for (int i = 0; i < n1; i++) {
            list1.insert(sc.nextInt());
        }

        LinkedList list2 = new LinkedList();
        System.out.println("Enter the number of elements in List 2:");
        int n2 = sc.nextInt();
        System.out.println("Enter the elements of List 2:");
        for (int i = 0; i < n2; i++) {
            list2.insert(sc.nextInt());
        }

        list1.merge(list2);
        list1.sort();
        System.out.println("Sorted List:");
        list1.printList();
    sc.close();
    }
}
