import java.util.*;
class Program9{
        public static void main(String args[]){
                Scanner sc = new Scanner(System.in);
                System.out.println("Enter the Number :");
                int no = sc.nextInt();

		int square = no*no;
		int temp=no;

		boolean isTrue = true;
		while(temp>0){
			if(temp%10 != square%10){
				isTrue = false;
				break;
			}
			temp = temp/10;
			square = square/10;
		}

		if(isTrue){
			System.out.print(no+" Number is Automarphic ");
		}else{
			System.out.print(no+" Number is not Automorphic ");
		}
		System.out.println();
       	}
}
