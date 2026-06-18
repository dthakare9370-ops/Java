import java.util.*;
class Program10{
	public static void main(String args[]){
		Scanner  sc = new Scanner(System.in);
		System.out.println("Enter Number of Rows : ");
		int row = sc.nextInt();

		int space=1,value=1;
		char ch = 'a';

		for(int i=1;i<=row*2-1;i++){
			if(i<=row){
				space=row-i;
				value=i*2-1;
				ch = (char)(64+row+1-i);
			}else{
				space=i-row;
				value=value-2;
				ch++;
			}

			for(int spc=1; spc<=space;spc++){
				System.out.print("\t");
			}

			for(int j=1;j<=value;j++){
				System.out.print(ch+"\t");
			}
			System.out.println();
		}
	}
}
