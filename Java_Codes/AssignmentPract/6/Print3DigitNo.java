import java.util.*;
class Print3DigitNo{
        public static void main(String args[]){
                Scanner sc = new Scanner(System.in);
                System.out.println("Enter the Number :- ");
                int no = sc.nextInt();
		int printNo = 99;
                for(int i=1;i<=no;i++){
                        System.out.print(" "+(i+printNo));
                }
		System.out.println();
        }
}
