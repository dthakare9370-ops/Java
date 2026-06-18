
class Demo{
        public static void main(String args[]){
                int arr[] = {-3,6,2,4,5,2,8,-9,3,1};
                int n = arr.length;

                int leftMax[] = new int[n];

		int max = Integer.MIN_VALUE;

                for(int i=0;i<n;i++){
                        if(max<arr[i]){
				max = arr[i];
			}
			leftMax[i] = max;
                }

                System.out.println("Left Find array Carry Forward ");
                for(int i=0 ;i<n;i++){
                        System.out.print(leftMax[i]+"\t");
                }
                System.out.println();
        }
}
