import java.util.*;
class Program10{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number : ");
		int no = sc.nextInt();

		int num = no;
		int originalNum = no;
		boolean isTrue = true;

		if(num == 1){
			System.out.print(no+" is Happy Number ");
		}else{
			while(num!=1){
				int sum =0;
					while(num>0){
						int rem = num%10;
						sum =sum + rem*rem;
						num=num/10;
					}
					if(sum == 1){
						System.out.print(no+" is Happy Number ");
						isTrue=true;
						break;
					}else{
						num = sum;
					}

					if(originalNum==num){
						isTrue=false;
						break;
					}

			}
		}

		if(!isTrue){
			System.out.println(no+ "is Sad number ");
		}

		System.out.println();
	}
}

		
						



