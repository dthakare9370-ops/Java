import java.util.*;
class CubeReverse{
        public static void main(String args[]){
                Scanner sc = new Scanner(System.in);
                System.out.println("Enter Number :- ");
                int no = sc.nextInt();

		int i=1;
                while(i<=no){
                        System.out.print(i*i*i+" ");
                        i++;
                }
                System.out.println();
        }
}
