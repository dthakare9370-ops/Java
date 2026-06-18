import java.util.*;
class Program10{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number of Rows : ");
		int row = sc.nextInt();
		if(row%2!=0){	
			for(int i=1;i<=row;i++){
				int no = 64+i;
				for(int j=1;j<=row+1-i;j++){
					if(no%2==0){
						System.out.print(no+"\t");
					}else{
						System.out.print((char)no+"\t");
					}
					no++;
				}
				System.out.println();
			}
		}else{
			for(int i=1;i<=row;i++){
                        	int no = 64+i;
                        	for(int j=1;j<=row+1-i;j++){
                                	if(no%2!=0){
                                        	System.out.print(no+"\t");
                               	 	}else{
                                	        System.out.print((char)no+"\t");
                               	 	}
                                	no++;
                        	}
                        	System.out.println();
                	}
		}
	}
}
