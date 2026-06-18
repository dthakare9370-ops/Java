import java.util.*;
class LessGre_10{
        public static void main(String rgs[]){
                Scanner sc = new Scanner(System.in);
                System.out.println("Enter the Number :- ");
                int no = sc.nextInt();

		if(no>10){
			System.out.println(no+" is Greater than 10");
		}else if(no == 10){
			System.out.println(no+"is Equal ");
		}else{
			System.out.println(no+" is Less Than 10 ");
		}
        }
}  
