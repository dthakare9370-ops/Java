import java.util.*;
class PrintSquareReverse{
        public static void main(String args[]){
                Scanner sc = new Scanner(System.in);
                System.out.println("Enter Number :- ");
                int no = sc.nextInt();
                int i = no;
	       	while(i>0){
                        System.out.print(i*i+" ");
                        i--;
                }
                System.out.println();
        }
}
