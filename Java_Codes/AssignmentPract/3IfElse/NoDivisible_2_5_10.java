import java.util.*;
class NoDivisible_2_5_10{
        public static void main(String rgs[]){
                Scanner sc = new Scanner(System.in);
                System.out.println("Enter the Number :- ");
                int no = sc.nextInt();

                if((no%2==0)&&(no%5==0 && no%10==0)){
                        System.out.println(no +" is Divisible by 2,5, and 10");
                }else{
                        System.out.println(no +" is Not Divisible by 2,5 and 10");
                }

        }
}
