import java.io.*;
class Program9{
	public static void main(String args[])throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter Number of row :");
		int row = Integer.parseInt(br.readLine());
		
		int no =0;
		char ch = 'a';
		for(int i=1;i<=row;i++){
			if(i%2==1){
			
				ch = (char)(64+row);
			}else{
				no = 1;
			}

			for(int j=1;j<=row;j++){
				if(i%2==1){
					System.out.print(ch+"\t");
					ch--;
				}else{
					System.out.print(no+"\t");
					no++;
				}
			}
			System.out.println();
		}
	}
}
