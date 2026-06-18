import java.util.*;

class Demo{
        static void fun(){
                Scanner sc = new Scanner(System.in);
		System.out.println("Enter the 2 Number : ");
		int x = sc.nextInt();
		int y = sc.nextInt();


		try{
                	System.out.println(x/y);
		}catch(ArithmeticException e){
                	System.out.println("Zero nako taku");
			y = sc.nextInt();
			System.out.println(x/y);
		}

		
        }

        public static void main(String args[]){
                System.out.println("Start main");
                fun();
                System.out.println("End Main");
        }
}
