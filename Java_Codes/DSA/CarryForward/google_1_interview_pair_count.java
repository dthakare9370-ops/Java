
class Demo{
	public static void main(String args[]){
		
		char arr[] = {'a','g','c','g','c','g'};
		
		int count=0;
		int n = arr.length;
		for(int i=0;i<n;i++){
			if(arr[i] == 'a'){
				for(int j=i+1;j<n;j++){
					if(arr[j]=='g'){
						for(int k=j+1;k<n;k++){
							if(arr[k]=='c'){
								count++;
							}
						}
					}
				}
			}
		}
		System.out.println("\nCount : "+count);
	}
}


