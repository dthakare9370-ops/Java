import java.util.*;
class Program9{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number of Rows : ");
		int row = sc.nextInt();
		
		
		for(int i=1;i<=row;i++){
			int no=row+1-i;
			if(row%2!=0){
				for(int j=1;j<=row+1-i;j++){
					if(i%2==0){
						System.out.print((char)(64+no)+"\t");
					}else{
						System.out.print((char)(96+no)+"\t");
					}
					no--;
				}
			}else{
				for(int j=1;j<=row+1-i;j++){
                                	if(i%2!=0){
                                        	System.out.print((char)(64+no)+"\t");
                                	}else{
                                        	System.out.print((char)(96+no)+"\t");
                                	}
                                	no--;
                        	}
			}
			System.out.println();
		}
	}
}
