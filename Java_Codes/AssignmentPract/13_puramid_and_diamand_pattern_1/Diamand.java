import java.util.*;
class Diamand{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number of Row : ");
		int row = sc.nextInt();

		int value=1,space=1;
		for(int i=1;i<=2*row-1;i++){
			if(i<=row){
				space = row-i;
				value = 2*i-1;
			}else{
				space = i-row;
				value = value-2;
				//value = 2*(2*row-i)-1;
			}

			for(int spc=1;spc<=space;spc++){
				System.out.print("  ");
			}
			for(int j=1;j<=value;j++){
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
			        	
