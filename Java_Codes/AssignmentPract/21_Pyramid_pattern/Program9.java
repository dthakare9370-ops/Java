import java.util.*;
class Program9{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number of Row : ");
		int row = sc.nextInt();

		int no=2;
		for(int i=1;i<=row;i++){

			for(int spc=1;spc<=row-i;spc++){
				System.out.print("\t");
			}

			for(int j=1;j<=i*2-1;){
					boolean isPrime=true;
					for(int k=2;k<no;k++){
						if(no%k==0){
							isPrime=false;
							break;
						}
					}
					if(isPrime){
						System.out.print(no+"\t");
						j++;						
					}
					no++;	
							
			}
			System.out.println();
		}
	}
}



