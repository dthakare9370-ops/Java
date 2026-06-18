import java.util.*;
import java.io.*;

class Farmer{
	String farmerName;
	int farmSize;
	String loc;
	float annIncome;

	Farmer(String farmerName,int farmSize,String loc,float annIncome){
		this.farmerName = farmerName;
		this.farmSize = farmSize;
		this.loc = loc;
		this.annIncome = annIncome;
	}

	void display(){
		System.out.println("\n****** Farmer Data *********");
		System.out.println("FarmerName : "+farmerName);
		System.out.println("FarmSize : "+farmSize+" acres");
		System.out.println("Location : "+loc);
		System.out.println("AnnualIncome : "+annIncome);
	}
}
class RealTimeExample{
	public static void main(String args[])throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		/*System.out.println("Enter FarmerName : ");
		String farmerName = br.readLine();
		System.out.println("Enter FarmSize : ");
		int farmSize = Integer.parseInt(br.readLine());
		System.out.println("Enter Location : ");
		String loc = br.readLine();
		System.out.println("Enter AnnualIncome : ");
		float annIncome = Float.parseFloat(br.readLine());
		*/

		System.out.println("Enter FarmerName, FarmSize,  Location,  AnnualIncome : ");
		String allInfo = br.readLine();

		StringTokenizer str = new StringTokenizer(allInfo," ");


	/*	System.out.println(""+str.nextToken());
		System.out.println(""+str.nextToken());
		System.out.println(""+str.nextToken());
		System.out.println(""+str.nextToken());
	*/

		//Farmer obj = new Farmer(farmerName,farmSize,loc,annIncome);
		//obj.display();
		
		Farmer obj = new Farmer(str.nextToken(),(Integer.parseInt(str.nextToken())),str.nextToken(),(Float.parseFloat(str.nextToken())));
                obj.display();

	}
}
