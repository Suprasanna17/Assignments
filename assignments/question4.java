import java.util.*;
class product{
	String prospecification;
	String productName;
	float procost;
	int procount;
	product(String name,String spec,float cost,int count){
		this.productName = name;
		this.prospecification = spec;
		this.procost = cost;
		this.procount = count;
	}
	public int proCount() {
		return this.procount;
	}
	public void productDetails() {
		System.out.println("Product cost : "+this.procost);
		System.out.println("Product Name : "+this.productName);
		System.out.println("Product Specification : "+this.prospecification);
		System.out.println("Product count : "+this.procount);
		System.out.println();
	}
	
	public void editProductName(String name) {
		this.productName = name;
	}
	public String getProduct() {
		return this.productName;
	}
	public void editUpdate(float cost) {
		this.procost = cost;
	}
	public void editUpdate(String spec) {
		this.prospecification = spec;
	}
	public void editUpdate(int count) {
		this.procount = count;
	}

}

public class question4 {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("No.of products\n ");
		int k= sc.nextInt();
		sc.nextLine();
		List<product>product = new ArrayList<product>();
		for(int i=0;i<k;i++) {
			System.out.println("Enter ProductName,Specification,Cost,Count : \n");
			String t = sc.nextLine();
			String []arr = t.split(" ");
			String name = arr[0];
			String spec = arr[1];
			float cost = Float.parseFloat(arr[2]);
			int count = Integer.parseInt(arr[3]);
			product pro1 = new product(name,spec,cost,count);
			product.add(pro1);
			System.out.println();
		}
		boolean temp = true;
		while(temp != false) {
			System.out.println();
			System.out.println("1.Product List  ");
			System.out.println("2.Product count ");
			System.out.println("3.Product details ");
			System.out.println("4.Edit product ");
			System.out.println("5.Update ");
			System.out.println("6.Exit");
			System.out.println("Enter your choice");
			int ch = sc.nextInt();
			if(ch == 1) {
					productList(product);
			}else if(ch == 2) {
				productcount(product);
			}else if(ch == 3) {
				productdetails(product);
			}else if(ch == 4) {
				editproduct(product);
			}else if(ch == 5) {
				updateInventory(product);
			}else if(ch  == 6) {
				temp= false;
			}else {
					System.out.println("No choice");
			}
			
		}
		sc.close();
	}
	public static void editproduct(List<product> pro) {
		System.out.println("Enter product name : ");
		sc.nextLine();
		String pname = sc.nextLine();
		for(product p1: pro) {
			if(p1.getProduct().compareToIgnoreCase(pname) == 0) {
				System.out.println("1.Specification\n2.Cost\n3.count");
				int ch = sc.nextInt();
				if(ch == 1) {
					System.out.println("Enter specification ");
					sc.nextLine();
					String st = sc.nextLine();
					p1.editUpdate(st);
				}else if(ch == 2) {
					System.out.println("Enter cost ");
					float cost = sc.nextFloat();
					p1.editUpdate(cost);
				}else {
					System.out.println("Enter count ");
					int count = sc.nextInt();
					p1.editUpdate(count);
				}
				return;
			}System.out.println();
		}
		System.out.println("Product doesnot exist");
	}
	
	
	public static void productList(List<product> product) {
		if(product.size() == 0) {
			System.out.println("No such product ");
			return;
		}
		int i=1;
		for(product p:product)
			System.out.println((i++) + " " +p.getProduct());
		System.out.println();
	}

	public static void productdetails(List<product> pro) {
		System.out.println("product name : ");
		sc.nextLine();
		String pname = sc.nextLine();
		for(product p: pro) {
			if(p.getProduct().compareToIgnoreCase(pname) == 0) {
				p.productDetails();
				return;
			}
		}
		System.out.println("Product doesnot exist");
        System.out.println();
	}

	public static void updateInventory(List<product> pro) {
		System.out.println("1. Add your product");
		System.out.println("2. Delete a product");
		System.out.println("Enter your choice");
        System.out.println();
		sc.nextLine();
		int m= sc.nextInt();
		if(m== 1) {
			System.out.println("Enter Name,count,Specification,cost ");
			sc.nextLine();
			String k = sc.nextLine();
			String []arr = k.split(" ");
			String name = arr[0];
			int count = Integer.parseInt(arr[1]);
			String spec = arr[2];
			float cost = Float.parseFloat(arr[3]);
			product pro1 = new product(name,spec,cost,count);
			pro.add(pro1);
		}else {
			System.out.println("Enter name of the product to delete product : ");
			sc.nextLine();
			String pname = sc.nextLine();
			int i = 0;
			for(product p: pro) {
				if((p.getProduct()).compareToIgnoreCase(pname) == 0) {
					break;
				}
				i++;
			}
			if(i == pro.size())
				System.out.println("product not found");
			else {
				pro.remove(i);
				System.out.println("Product removed ");
			}
		}
	}

	public static void productcount(List<product> pro) {
		System.out.print("Enter product name : ");
		sc.nextLine();
		String pname = sc.nextLine();
		boolean flag= false;
		for(product p: pro) {
			if((p.getProduct()).compareToIgnoreCase(pname) == 0) {
				System.out.println(p.proCount());
				flag= true;
				break;
			}
		}
		if(!flag)
		System.out.println("Product doesnot exist");
	}
}