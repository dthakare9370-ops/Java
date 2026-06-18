import java.io.*;
class Program10{
	public static void main(String args[])throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter Number of Rows : ");
		int row = Integer.parseInt(br.readLine());

		char ch = 'A';
		for(int i=1;i<=row;i++){
			ch = (char)(64+row);
			/*for(int spc=1;spc<=i-1;spc++){
				System.out.print("\t");
			}
			for(int j=1;j<=row+1-i;j++){
				System.out.print(ch+"\t");
				ch--;
			}*/

			for(int j=1;j<=row;j++){
				if(j<=i-1){
					System.out.print("\t");
				}else{
					System.out.print(ch+"\t");
                                	ch--;
				}
			}
			System.out.println();
		}
	}
}
