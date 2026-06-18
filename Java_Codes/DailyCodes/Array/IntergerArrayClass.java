class IntegerArrayClass{
	public static void main(String args[]){
		int a[] = new int[]{10,20,200};
		Integer a1[] = new Integer[]{10,10,128};
		for(int i=0;i<a1.length;i++){
			System.out.println(System.identityHashCode(a[0]));
		}

		System.out.println("\n\n");
		for(int i=0;i<a1.length;i++){
			System.out.println(System.identityHashCode(a1[i]));
		}
	}
}
