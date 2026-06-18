import java.io.*;
class Program4{
        public static void main(String args[])throws IOException{
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

                System.out.println("Enter Number of Rows :");
                int row = Integer.parseInt(br.readLine());

                char ch = 'A';
                for(int i=1;i<=row;i++){
                        for(int j=1;j<=i;j++){
                                System.out.print(ch+"\t");
                                ch++;
                        }
                        System.out.println();
                }
        }
}
