import java.util.*;
import java.io.*;
class Society{
	String sName,location,seName;
	Society(String sName,String location,String seName){
		this.sName = sName;
		this.location = location;
		this.seName = seName ;
	}
	void viewSocietydetails() {
    	System.out.println("Society Name : "+this.sName );
		System.out.println(" Location : " + this.location);
		System.out.println( " Secretory Name : "+ this.seName);
		System.out.println("-------------------------------------------------");
    }
}

class building extends Society {
	String Name;
	int totalApartments;
	building(String Name,int totalApartments,String sName,String location,String seName) {
		super( sName, location, seName);	
		this.Name = Name;
		this.totalApartments = totalApartments;
	}
	void viewBuildingdetails() {
    	System.out.println("Building name : "+this.Name );
		System.out.println(" total Apartments : " + this.totalApartments);
		System.out.println("------------------------------------------------------");
    }
}

class apartment extends building{
    int apartmentNo;
    String Name;
    String ElectricMeterNo;
    apartment(int apartmentNumber, String OwnerName, String electricMeterNumber,String buildingName,int totalNumberOfApartments,String societyName,String location,String secretoryName){
    	super( buildingName, totalNumberOfApartments, societyName, location, secretoryName);
    	this.apartmentNo = apartmentNumber;
    	this.Name = OwnerName;
    	this.ElectricMeterNo = electricMeterNumber;
    }
    void viewDetails() {
    	System.out.println("Apartment Number : "+this.apartmentNo );
		System.out.println(" Owner Name : " + this.Name );
		System.out.println("Electric Meter Number : "+this.ElectricMeterNo);
		System.out.println(("------------------------------------------------------------"));
    }
}

public class Question4{

	public static void main(String[] args) {
		
		List<String[]> li = read("data.csv");
		apartment a1[] = new apartment[10];
    	apartment a2[] = new apartment[10];
    	apartment a3[] = new apartment[10];
    	int i = 0, j = 0, k =0 ;
    	for(String[] ele:li) {
    		if(ele[1].compareTo("A")== 0) {
    			a1[i] = new apartment(Integer.parseInt(ele[0]),ele[2],ele[3],ele[1],19,"Abdul kalam Society"," Hi-Tech city, Hyderabad","Lalitha");
    					i++;
    		}else if(ele[1].compareTo("B") == 0) {
    			a2[j] = new apartment(Integer.parseInt(ele[0]),ele[2],ele[3],ele[1],20,"Ratan Tata Society","Tank Bund, Hyderabad","Sarah");
				j++;
    		}else {
    			a3[k] = new apartment(Integer.parseInt(ele[0]),ele[2],ele[3],ele[1],8,"ABC Society"," Banjara Hills, Hyderabad","Saran");
				k++;
    		}
    	}
    	int n;
    	System.out.println("Apartment Details \n ");
    	for(n = 0 ; n < i ; n++)
    		a1[n].viewDetails();
    	for(n = 0 ; n < j ; n++)
    		a2[n].viewDetails();
    	for(n = 0 ; n < k ; n++)
    		a3[n].viewDetails();
    	System.out.println("Building Details \n ");
    	for(n = 0 ; n < i ; n++)
    		a1[n].viewBuildingdetails();
    	for(n = 0 ; n < j ; n++)
    		a2[n].viewBuildingdetails();
    	for(n = 0 ; n < k ; n++)
    		a3[n].viewBuildingdetails();
    	System.out.println("Society Details \n ");
    	for(n = 0 ; n< i ; n++)
    		a1[n].viewSocietydetails();
    	for(n= 0 ; n< j ;n++)
    		a2[n].viewSocietydetails();
    	for(n = 0 ; n< k ;n++)
    		a3[n].viewSocietydetails();
	}
	public static List<String[]> read(String File){
		ArrayList<String[]> list = new ArrayList<>();
		try {
	         File file = new File(File);
	         FileReader fl = new FileReader(file);
	         BufferedReader sc= new BufferedReader(fl);
	         String line = "";
	         String[] tempArr;
	         while((line = sc.readLine()) != null) {
	            tempArr = line.split(",");
	            list.add(tempArr);
	         }
	         sc.close();
	         } catch(IOException ioe) {
	            
	         }
		return list;

	}

}