import java.io.*;
class ReadMethod_Buffered{
	public static void main(String args[])throws IOException{
		BufferedReader b = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter Student Name :- ");
		String name = b.readLine();

		System.out.println("Enter Gender (M/F) in single charactor :- ");
		char gender = (char)b.read();
		b.skip(1);

		System.out.println("Enter Student Id : ");
		int id = Integer.parseInt(b.readLine());

		System.out.println("Enter Student Address :- ");
                String address = b.readLine();

		System.out.println("Total Class Fees : ");
	        float totalFees = Float.parseFloat(b.readLine());

		System.out.println("Paid Fees : ");
		float paidFees = Float.parseFloat(b.readLine());

		System.out.println("\n***** C2W Data *****");
		System.out.println("Name : "+name);
		System.out.println("Gender : "+gender);
		System.out.println("Id : "+id);
		System.out.println("Address : "+address);

		System.out.println("Total Fees : "+totalFees);
		System.out.println("Paid Fees : "+paidFees);
		System.out.println("Remaining Fees : "+(totalFees-paidFees));
		System.out.println("\nThanks to join C2W");
	}

}	
