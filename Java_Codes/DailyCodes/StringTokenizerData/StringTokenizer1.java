import java.util.*;
class StringTokenizer1{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter ID_NO,StudentName,ColllegeName,Per,Dep,DOB :");
		String str = sc.nextLine();

		StringTokenizer str1 = new StringTokenizer(str," ");


		System.out.println("\n**** Student Detail *****");
		int id = Integer.parseInt(str1.nextToken());
		System.out.println("StudId : "+id);
		System.out.println("studentName : "+str1.nextToken());
		System.out.println("collegeName : "+str1.nextToken());
		double per= Double.parseDouble(str1.nextToken());
		System.out.println("percentage : "+per);
		System.out.println("Dep : "+str1.nextToken());
		System.out.println("DOB : "+str1.nextToken());
	}
}
