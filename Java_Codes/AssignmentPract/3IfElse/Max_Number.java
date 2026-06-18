import java.util.*;
class MaxNumber{
        public static void main(String rgs[]){
                Scanner sc = new Scanner(System.in);
                System.out.println("Enter the First Number :- ");
                int no1 = sc.nextInt();
		System.out.println("Enter the Second Number :- ");
                int no2 = sc.nextInt();

                if(no1>no2){
                        System.out.println(no1 +" is Maximum between "+no1+","+no2);
                }else{
                        System.out.println(no2 +" is Maximum between "+no1+","+no2);
                }

        }
}
