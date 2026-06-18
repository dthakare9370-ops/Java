import java.util.*;
class EvenNo{
        public static void main(String args[]){
                Scanner sc = new Scanner(System.in);
                System.out.println("Enter the Number :- ");
                int no = sc.nextInt();
                
                for(int i=1;i<=no;i++){
			if(i%2==0){
				System.out.print(i+" ");;
			}
                }
                System.out.println();
        }
}
