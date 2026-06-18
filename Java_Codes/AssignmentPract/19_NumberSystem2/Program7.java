//Strong Number 
import java.util.*;
class Program7{
        public static void main(String args[]){
                Scanner sc = new Scanner(System.in);
                System.out.println("Enter the Start Number :");
                int start = sc.nextInt();
		System.out.println("Enter the End Number :");
                int end = sc.nextInt();

		for(int temp=start;temp<=end;temp++)
		{	
			int sum=0;
			int num = temp;
			while(num>0){
				int rem = num%10;
				int fact=1;
				for(int i=1;i<=rem;i++){
					fact = fact *i;
				}
				sum = sum + fact;
				num = num/10;
			}

			if(temp==sum){
				System.out.print(temp+"\t");
			}		
		}
		System.out.println();

	}
}
