import java.util.*;
class Program5{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of Row : ");
		int row = sc.nextInt();

		for(int i=1;i<=row;i++){
			int no = 1;
			
			for(int spc=1;spc<=i-1;spc++){
				System.out.print("\t");
			}

			if(row%2==0){
				for(int j=1;j<=row+1-i;j++){
					if(i%2!=0){
						System.out.print(no+"\t");
					}else{
						System.out.print((char)(64+no)+"\t");
					}
					no++;
				}
			}else{
				for(int j=1;j<=row+1-i;j++){
                                        if(i%2==0){
                                                System.out.print(no+"\t");
                                        }else{
                                                if(i==1 && j%2==0){
							 System.out.print((char)(96+no)+"\t");
						}else{
							System.out.print((char)(64+no)+"\t");
						}
                                        }
                                        no++;
                                }
			}

			System.out.println();
		}
	}
}
