import java.util.*;
class CountDownAss{
        public static void main(String args[]){
                Scanner sc = new Scanner(System.in);
                System.out.println("Enter Day :- ");
                int no = sc.nextInt();
                
                while(no>=0){
                        if(no==0){
                                System.out.print("0 days Assignment is Overdue ");
                        }else{
				System.out.println(no+" day reamaining");
			}
			no--;
                }
                System.out.println();
        }
}
