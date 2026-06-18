
class Demo{
	public static void main(String args[]){
		int arr[] = {-3,6,2,4,5,2,8,-9,3,1};
		int n = arr.length;

		int leftMax[] = new int[n];

		for(int i=0;i<n;i++){
			int max = Integer.MIN_VALUE;
			
			for(int j=0;j<=i;j++){
				
				if(max<arr[j]){
					max = arr[j];
				}

			}
			leftMax[i] = max;
		}

		System.out.println("Left Find array ");
		for(int i=0 ;i<n;i++){
			System.out.print(leftMax[i]+"\t");
		}
		System.out.println();
	}
}
