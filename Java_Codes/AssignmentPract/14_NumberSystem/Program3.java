import java.util.*;
class Program3{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int no = sc.nextInt();

		int count=0,i=2;
		while(i<=no/2){
			if(no%i==0){
				count++;
			}
			i++;
		}

		if(count>0){
			System.out.println(no + " is Composite");
		}else{
			System.out.println(no + " Not is Composite");	
		}
	}
}
