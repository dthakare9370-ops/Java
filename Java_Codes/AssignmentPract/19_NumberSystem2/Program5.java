//Harshal Number 
import java.util.*;
class Program5{
        public static void main(String args[]){
                Scanner sc = new Scanner(System.in);
                System.out.println("Enter the Start Number :");
                int start = sc.nextInt();
                System.out.println("Enter the End Number : ");
                int end = sc.nextInt();
		
		for(int num = start;num<=end;num++){
			int no = num ;
			int sum=0;
			while(no>0){
				int rem = no%10;
				sum = sum + rem;
				no=no/10;
			}

			if(num%sum==0){
				System.out.print(num+"\t");
			}
		}
		System.out.println();
	}
}
