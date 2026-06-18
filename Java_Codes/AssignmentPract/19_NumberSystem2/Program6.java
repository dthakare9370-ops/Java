//Fibonacci Series
import java.util.*;
class Program6{
        public static void main(String args[]){
                Scanner sc = new Scanner(System.in);
                System.out.println("Enter the Number :");
                int no = sc.nextInt();

		int a[] = new int[no];
		int num1=0;
		int num2=1;

		a[0]=num1;
		a[1]=num2;

		for(int i=2;i<no;i++){
			int num3 = num1+num2;
			a[i]=num3;
			num1=num2;
			num2=num3;
		}

		for(int i=0;i<no;i++){
			System.out.print(a[i]+"\t");
		}
		System.out.println();

	}
}
