//try catch finally

import java.util.*;
class Demo{
        public static void main(String args[]){
                Scanner sc = new Scanner(System.in);
                System.out.println("Enter 2 number : ");
                int x = sc.nextInt();
                int y = sc.nextInt();

                try{
                        System.out.println(x/y);
                }
		finally{
                        System.out.println("In Finnaly Block");
                        System.out.println("Clean up code");
                        System.out.println("database Connection close");
                }
        }
}
