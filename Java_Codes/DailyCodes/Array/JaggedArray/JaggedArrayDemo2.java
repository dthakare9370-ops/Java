import java.util.*;

class JaggedArrayDemo2{
	public static void main(String args[]){
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Rows for Jagged Array : ");
		int row = sc.nextInt();
		int a[][] = new int[row][];

		int col;

		for(int i=0;i<row;i++){
			System.out.print(i + " Row how any columns : ");
			col = sc.nextInt();
			System.out.println();
			a[i] = new int[col];
		}

		System.out.println("Enter the jagged  Array Elements :");
		for(int i=0;i<a.length;i++){
                        for(int j=0;j<a[i].length;j++){
                                System.out.print("a["+i+"]"+"["+j+"] : ");
				a[i][j] = sc.nextInt();
				System.out.println();
                        }
                }
	
		System.out.println("Jagged Array Elements Are :"); 
		for(int i=0;i<a.length;i++){
			for(int j=0;j<a[i].length;j++){
				System.out.print(a[i][j] +" ");
			}
			System.out.println();
		}
	}
}
