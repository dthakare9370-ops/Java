import java.util.*;
class DivisibleBy6{
        public static void main(String args[]){
                Scanner sc = new Scanner(System.in);
                System.out.println("Enter Number : - ");
                float no = sc.nextFloat();

                if(no%6==0){
                        System.out.println(no + " is Divsible by 6");
                }else{
			System.out.println(no + " is Not Divisible by 6");
		}
        }
}
