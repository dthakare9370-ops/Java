import java.io.*;
class Program7{
	public static void main(String args[])throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter Number of Row :");
		int row = Integer.parseInt(br.readLine());

		char ch;
		int no;
		for(int i=1;i<=row;i++){
			if(i%2==1){
				no=1;
				ch='A';
			}else{
				no = row;
				int data = 64+no;
				ch = (char)data;
			}

			for(int j=1;j<=row;j++){
				if(i%2==1){
					System.out.print(no+""+ch+"\t");
					ch++;
					no++;
				}else{
					System.out.print(no+""+ch+"\t");
					ch--;
					no--;
				}
			}
			System.out.println();
		}
	}
}
