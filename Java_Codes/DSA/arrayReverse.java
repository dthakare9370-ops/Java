
class ArrayReverse{
	public static void main(String args[]){
		int arr[] = {8,4,1,9,2,6,7};
		int j = arr.length-1;

		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+"\t");
		}
		System.out.println();
		
		for(int i=0;i<j;i++){
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
			j--;
		}

		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+"\t");
		}
		System.out.println();
	}
}

