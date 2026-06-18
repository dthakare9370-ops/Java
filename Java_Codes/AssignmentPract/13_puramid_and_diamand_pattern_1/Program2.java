import java.io.*;
class Program2{
	public static void main(String args[])throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter Number of Rows : ");
		int row = Integer.parseInt(br.readLine());

		int no = 1;
		for(int i=1;i<=row;i++){
			//Space
			for(int spc=1;spc<=row-i;spc++){
				System.out.print("  ");
			}

			//Value
			for(int j=1;j<=i*2-1;j++){
				if(no==9){
				
				}else{
					System.out.print(no+" ");
				}
				no=no+2;
			}
			System.out.println();
		}
	}
}


