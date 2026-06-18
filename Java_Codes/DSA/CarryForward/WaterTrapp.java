
class WaterTrapp_Problem{
	public static void main(String args[]){

		int arr[]={0,1,0,2,1,0,1,3,2,1,2,1};

		int n = arr.length;

		int leftMax[] = new int[n];
		int rightMax[] = new int[n];

		leftMax[0] = arr[0];
		rightMax[n-1] = arr[n-1];

		//left Max
		for(int i=1;i<n;i++){
			leftMax[i] = Math.max(leftMax[i-1],arr[i]);
		}

		//Right Max
		for(int i=n-2;i>=0;i++){
			rightMax[i] = Math.max(rightMax[i+1],arr[i]);

		}
		
		int ans = 0;
		for(int i=0;i<n;i++){
			ans = ans+(Math.max(leftMax[i],rightMax[i])-arr[i]);
		}

		System.out.println(ans);


	}
}

