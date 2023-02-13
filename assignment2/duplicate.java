import java.util.*;
class Node{
    int data;
    Node next;
    Node(int d)
    {
        data=d;
        next=null;
    }
}

class duplicate
{
    public static void main(String[] args) {

    
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of Linked list");
        Node start=null,temp=null;
        int n=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            int m=sc.nextInt();
            Node newnode=new Node(m);
            if(start==null)
            {
                start=newnode;
                temp=newnode;
            }
            else{
                temp.next=newnode;
                temp=temp.next;
            }
        }
        Node res=null,temp1=null;
        ArrayList<Integer>arr=new ArrayList<>();
        while(start!=null)
        {
            if(!arr.contains(start.data))
            {
                arr.add(start.data);
                Node newnode=new Node(start.data);
                if(res==null)
                {
                    res=newnode;
                    temp1=newnode;
                }
                else{
                    temp1.next=newnode;
                    temp1=newnode;
                }
            }
            start=start.next;
        }
        while(res!=null)
        {
            System.out.print(res.data+" ");
            res=res.next;
        }
        sc.close();
    }
}