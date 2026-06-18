import java.util.*;
class CountOddNumber{
        public static void main(String args[]){
                Scanner sc = new Scanner(System.in);
                System.out.println("Enter the Number :- ");
                int no = sc.nextInt();
		int count = 0;
                for(int i=1;i<=no;i++){
                        if(i%2!=0){
                               count++;
                        }
                }
                System.out.println("Odd Number : "+count);
	}                                                                           }
