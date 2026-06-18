import java.io.*;
class Diamand2{
	public static void main(String args[])throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter Number of Row : ");
		int row = Integer.parseInt(br.readLine());

		int space=0,value=0,no=0;
		for(int i=1;i<=2*row-1;i++){

			if(i<=row){
				space=row-i;
				value = i*2-1;
				no=row+1-i;
			}else{
				space=i-row;
				value=value-2;
				no=i-row+1;
			}

			for(int spc=1;spc<=space;spc++){
				System.out.print("\t");
			}
			for(int j=1;j<=value;j++){
				if(j<=value/2){
					System.out.print(no+"\t");
					no++;
				}else{
					System.out.print(no+"\t");
					no--;
				}
			}
			System.out.println();	
		}

	}
}
