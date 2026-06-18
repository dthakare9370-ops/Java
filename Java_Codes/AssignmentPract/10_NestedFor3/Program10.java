import java.io.*;
class Program10{
	public static void main(String args[])throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter Number of row :");
		int row = Integer.parseInt(br.readLine());
		
		int no = 1;
		char ch = 'a';
		for(int i=1;i<=row;i++){
			if(i%2==1){
				ch = (char)(64+row);
				no = row;
			}else{
				ch = 'A';
				no=1;
			}

			for(int j=1;j<=row;j++){
				if(i%2==1){
					if(j%2==0){
						System.out.print(no+"\t");
					}else{
						System.out.print(ch+"\t");
					}
					ch--;
					no--;
				}else{
					if(j%2==0){
						System.out.print(no+"\t");
					}else{
						System.out.print(ch+"\t");
					}
					ch++;
					no++;
				}
			}
			System.out.println();
		}
	}
}
