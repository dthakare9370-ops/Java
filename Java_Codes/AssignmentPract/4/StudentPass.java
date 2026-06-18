import java.util.*;
class StudentPass{
        public static void main(String args[]){
                Scanner sc = new Scanner(System.in);
                System.out.println("Enter Marks : - ");
                int marks = sc.nextInt();

                if(marks>=75){
                        System.out.println("Pass : First class with distinction");
                }else if(marks>=60 && marks<=75){
			System.out.println("Pass : First Class");
		}else if(marks>=50 && marks<=60){
		        System.out.println("Pass : Second Class");
		}else if(marks>=40){
			System.out.println("Pass");
		}else{
			System.out.println("Fail");
		}	
        }
}
