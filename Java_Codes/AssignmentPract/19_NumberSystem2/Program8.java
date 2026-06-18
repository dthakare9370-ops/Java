 
import java.util.*;
class Program8{
        public static void main(String args[]){
                Scanner sc = new Scanner(System.in);
                System.out.println("Enter the Start Number :");
                int start = sc.nextInt();
		System.out.println("Enter the End Number :");
                int end = sc.nextInt();

		for(int no=start;no<=end;no++){

			int count = 0;
			int temp = no;

			while(temp>0){
				count++;
				temp=temp/10;
			}
	
	
			int num = no;
			int sum = 0;
			while(num>0){
				int rem = num%10;
				int product=1;
				for(int i=1;i<=count;i++){
					product = product*rem;
				}
				sum = sum + product;
				num = num/10;
			}
			if(no==sum){
				System.out.print(no+"\t");
			}
		}
		
		System.out.println();

	}
}
