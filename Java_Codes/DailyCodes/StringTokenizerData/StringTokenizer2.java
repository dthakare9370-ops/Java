import java.util.*;

class StringTokenizer2{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the empName,CmpName,Salary,Location");
		String str = sc.nextLine();

		StringTokenizer str1 = new StringTokenizer(str, " ");

		while(str1.hasMoreTokens()){
			System.out.println(str1.nextToken());
		}
	}
}
