import java.io.*;
class Program8{
	public static void main(String args[])throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter Number of Row :");
		int row = Integer.parseInt(br.readLine());

		for(int i=1;i<=row;i++){
			for(int j=1;j<=row;j++){
				if(i%3==1){
					System.out.print("#\t");
				}else if(i%3==2){
					System.out.print("$\t");
				}else if(i%3==0){
					System.out.print("@\t");
				}
			}
			System.out.println();
		}
	}
}
