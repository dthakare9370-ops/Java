import java.util.*;
class NoDivisible_7and3{
        public static void main(String rgs[]){
                Scanner sc = new Scanner(System.in);
                System.out.println("Enter the Number :- ");
                int no = sc.nextInt();

                if(no%7==0){
                        System.out.println(no +" is Divisible by 7");
                }else if(no%3==0){
                        System.out.println(no +" is Not Divisible by 3");
                }else{
			System.out.println(no +" is not divisible by 3 or 7");
		}

        }
}
