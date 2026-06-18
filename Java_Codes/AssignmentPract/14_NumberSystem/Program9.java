import java.util.*;
class Program9{
        public static void main(String args[]){
                Scanner sc = new Scanner(System.in);
                System.out.println("Enter the Number : ");
                int no = sc.nextInt();
                int temp = no;
                int rem=0,rev=0;
                while(no>0){
                        rem = no%10;
                        rev = rev*10+rem;
                        no=no/10;
                }

                System.out.println(temp+" Is reverse Number is : "+rev);
        }
}
