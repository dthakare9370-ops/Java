import java.util.*;

class Stack{
	int maxSize;
	int top=1;
	int stkArr[];

	Stack(int maxSize){
		this.maxSize = maxSize;
		stkArr = new int[maxSize];
	}
}

class Client{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Size of Stack");
		int maxSize=sc.nextInt();

		Stack st = new Stack();
		int ch;
		do{
			System.out.println("Stack Operation using : Array");
			System.out.println("1.Push");
			System.out.println("2.Pop");
			System.out.println("3.Peek");
			System.out.println("4.Empty");
			System.out.println("5.Size");
			System.out.println("6.Exit");
			System.out.println("Enter Your Choice : ");
			ch = sc.nextInt();

			switch(ch){
				case 1 : {
				
				}	 
			}
		}while(ch!-6);







	}
}

