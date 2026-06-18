
class Demo{
	public static void main(String args[]){
		int arr[] = {-3,6,2,4,5,8,-9,3,1};
		int n = arr.length;

		int rightMax[] = new int[n];
		
		int max = Integer.MIN_VALUE;

	/*	for(int i=n-1;i>=0;i--){
			if(max<arr[i]){
				max = arr[i];
			}
			rightMax[i] = max;
		}
	*/

		rightMax[n-1] = arr[n-1];
		for(int i=n-2;i>=0;i--){
			rightMax[i] = Math.max(arr[i],rightMax[i+1]);
		}

		System.out.println("\n Array : ");
		for(int i=0;i<n;i++){
			System.out.println(rightMax[i]);
		}
	}
}

