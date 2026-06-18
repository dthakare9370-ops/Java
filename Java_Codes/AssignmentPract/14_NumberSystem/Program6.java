//Sum of digit
import java.io.*;
class Program6{
        public static void main(String args[])throws IOException{
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                System.out.println("Enter the Number : ");
                int no = Integer.parseInt(br.readLine());

                int sum=0,rem=0;
                while(no>0){
                        rem = no%10;
                        sum = sum + rem;
                        no = no/10;
                }
                System.out.println("Sum Of Digit : "+sum);
        }
}
