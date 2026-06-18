import java.util.*;
class Program8{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number of Rows : ");
		int row = sc.nextInt();

		int space=1,value=1,no=1;
		for(int i=1;i<=row*2-1;i++){
			if(i<=row){
				space=row-i;
				value=i*2-1;
				no=row+1-i;
			}else{
				space=i-row;
				value-=2;
				no+=2;
			}

			for(int spc=1;spc<=space;spc++){
				System.out.print("\t");
			}

			for(int j=1;j<=value;j++){
				if(j<=value/2){
					System.out.print((char)(64+no)+"\t");
					no++;
				}else{
					System.out.print((char)(64+no)+"\t");
					no--;
				}
			}
			System.out.println();
		}
	}
}
