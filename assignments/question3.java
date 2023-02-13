import java.util.*;
class question3
{
    static Scanner sc=new Scanner(System.in);
    static void addproducts(ArrayList<String>list,ArrayList<ArrayList<String>>d,ArrayList<Integer>cost)
    {
        System.out.println("product name");
        String name=sc.next();
        list.add(name);
        System.out.println("product quantity");
        int quantity=sc.nextInt();
        System.out.println("Specifications");
        sc.nextLine();
        String spec=sc.nextLine();
        System.out.println("Cost");
        String pcost=sc.next();
        ArrayList<String>arr=new ArrayList<>();
        arr.add(spec);
        arr.add(pcost);
        arr.add(Integer.toString(quantity));
        d.add(arr);
        cost.add(quantity);
    }
    
    static void viewdetails(ArrayList<String>list,ArrayList<ArrayList<String>>d,ArrayList<Integer>cost)
    {
        for(int i=0;i<list.size();i++)
        {
            System.out.print(list.get(i)+"  ");
            String m="";
            for(int j=0;j<d.get(i).size();j++)
            m+=d.get(i).get(j)+" ";
            System.out.print(m);
            System.out.println();
        }
    }

    static void productlist(ArrayList<String>list,ArrayList<Integer>cost)
    {
        System.out.println("Enter name of the product");
        String name=sc.next();
        int m=list.indexOf(name);
        System.out.println(list.get(m)+" "+cost.get(m));
    }

    

    static void edit(ArrayList<String>list,ArrayList<ArrayList<String>>d,ArrayList<Integer>cost)
    {
        System.out.println("Enter productname");
        String pro1=sc.next();
        int m=list.indexOf(pro1);
        System.out.println("Enter product quantity");
        int quantity=sc.nextInt();
        System.out.println("Enter Specifications");
        sc.nextLine();
        String spec=sc.nextLine();
        System.out.println("Enter Cost");
        String pcost=sc.next();
        ArrayList<String>arr=new ArrayList<>();
        arr.add(spec);
        arr.add(pcost);
        arr.add(Integer.toString(quantity));
        d.set(m,arr);
        cost.set(m,quantity);
    }

    static void count(ArrayList<String>list,ArrayList<Integer>cost)
    {
        System.out.println("Enter productname");
        String pname=sc.next();
        int k=list.indexOf(pname);
        System.out.println(list.get(k)+" "+cost.get(k));
    }


    static void update(ArrayList<String>list, ArrayList<ArrayList<String>>d,ArrayList<Integer>cost)
    {
        System.out.println("Enter 1 to add\n");
        System.out.println("Or Enter 2 to delete");
        int cho=sc.nextInt();
        if(cho==1)
        {
            System.out.println("product name");
            String pname=sc.next();
            System.out.println("Enter count of items to add");
            int n=sc.nextInt();
            int i=list.indexOf(pname);
            cost.set(i,cost.get(i)+n);
            int k=cost.get(i);
            d.get(i).set(2,Integer.toString(k));
        }
        else
        {
            System.out.println("product name");
            String pname=sc.next();
            System.out.println("enter count of items to delete");
            int n=sc.nextInt();
            int i=list.indexOf(pname);
            cost.set(i,cost.get(i)-n);
            int m=cost.get(i);
            d.get(i).set(2,Integer.toString(m));
        }
    }

    public static void main(String[] args) {
        ArrayList<String> list=new ArrayList<>();
        ArrayList<ArrayList<String>> d=new ArrayList<>();
        ArrayList<Integer>  cost=new ArrayList<>();
        System.out.println("Enter total items");
        int n=sc.nextInt();
        for(int i=0;i<n;i++)
        addproducts(list,d,cost);
        viewdetails(list, d, cost);     
	    productlist(list,cost);
	    edit(list,d,cost);
	    count(list,cost);
	    update(list,d,cost);
    } 
}