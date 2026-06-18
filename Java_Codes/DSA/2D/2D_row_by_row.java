
class Matrix2D_Col_by_Col{
	public static void main(String args[]){

		int arr[][] = new int[][]{ {1,2,3,4},{5,6,7,9},{9,10,11,12}};

		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr[i].length;j++){
				System.out.print(arr[i][j]+"\t");
			}
			System.out.println();
		}
	}
}
