import java.io.*;
class Program6{
	public static void main(String args[])throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter Number of Row : ");
		int row = Integer.parseInt(br.readLine());

		char ch;
		for(int i=1;i<=row;i++){
			if(i%2!=0){
				int data = 64+row;
				ch =(char)data;
			}else{
				ch = 'A';
			}

			for(int j=1;j<=row;j++){
				if(i%2==1){
					System.out.print(ch+"\t");
					ch--;
				}else{
					System.out.print(ch+"\t");
					ch++;
				}
			}
			System.out.println();
		}
	}
}
