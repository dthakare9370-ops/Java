import java.io.*;
class BufferedReaderDemo{
	public static void main(String args[])throws IOException{
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);

		System.out.println("Enter companyName : ");
		String companyName = br.readLine();

		System.out.println("Enter Company Loc : ");
		String companyLocation = br.readLine();

		System.out.println("Enter Employee Name : ");
		String eName = br.readLine();

		System.out.println("Enter Employee Id : ");
		int eId = Integer.parseInt(br.readLine());

		System.out.println("Enter Employee Salary : ");
		float eSalary = Float.parseFloat(br.readLine());


		System.out.println("\n****** Employee Data *******");
		System.out.println("Company Name : "+companyName);
		System.out.println("Company Location : "+companyLocation);
		System.out.println("E_name : " + eName);

		System.out.println("E_Salary : "+eSalary);
	}
}
