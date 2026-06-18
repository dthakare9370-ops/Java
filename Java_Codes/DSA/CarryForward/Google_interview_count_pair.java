
class CountPairs{
	public static void main(String args[]){
		char ch[] = new char[]{'a','b','e','g','a','g'};

		int n = ch.length;

		int count = 0;
		int itr=0;

	/*	for(int i=0;i<n;i++){
			for(int j=i+1;j<n;j++){
				if(ch[i]=='a' && ch[j]=='g'){
					count++;
				}
				itr++;
			}
		}

	*/


		for(int i=0;i<n;i++){
			
			if(ch[i] == 'a'){
				for(int j=i+1;j<n;j++){
					if(ch[j]=='g'){
						count++;
					}
					itr++;
				}
			}
		}


		for(int i=0;i<n;i++){
			System.out.print(ch[i]+"\t");
		}
		System.out.println("\nCount : "+count);
		System.out.println("ITR : "+itr);
	}
}
