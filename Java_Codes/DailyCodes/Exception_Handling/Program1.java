import java.io.*;

class Demo{
	public static void main(String args[])throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the name of Emp : ");
		String empName = br.readLine();
		System.out.println(empName);

		System.out.println("\nEnter the id : ");
		int id = Integer.parseInt(br.readLine());

		System.out.println(id);
	}
}
