import java.util.*;
class PrintThreeDigitNo{
        public static void main(String args[]){
                Scanner sc = new Scanner(System.in);
                System.out.println("Enter the Number :- ");
                int no = sc.nextInt();
		int printNo=99;
		int i=1;
		while(i<=no){
                	System.out.print(i+printNo+" ");
			i++;
		}
		System.out.println();
	}
}
