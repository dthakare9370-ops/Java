//Duck Number 
import java.util.*;
class Program4{
        public static void main(String args[]){
                Scanner sc = new Scanner(System.in);
                System.out.println("Enter the Start Number :");
                int start = sc.nextInt();
                System.out.println("Enter the End Number : ");
                int end = sc.nextInt();
		
	
		for(int no=start;no<=end;no++){
			int rem;
			int num = no;
			while(num>0){
				rem = num%10;
				if(rem==0){
					System.out.print(no+"\t");
					break;
				}
				num = num/10;
			}
		}
		System.out.println();
	}
}
