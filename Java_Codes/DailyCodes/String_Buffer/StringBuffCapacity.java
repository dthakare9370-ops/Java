class StringBuffCapacity{
	public static void main(String args[]){
		StringBuffer str1 = new StringBuffer();
		System.out.println(str1.capacity()); // Default size empty is 16 charactor 


		str1.append("core2Web");
		System.out.println(str1);
		System.out.println(str1.capacity());
			
		str1.append("Inculators");
		System.out.println(str1);
		System.out.println(str1.capacity());

		str1.append("core2Web");
		System.out.println(str1);
                System.out.println(str1.capacity());

		str1.append("core2Web");
		System.out.println(str1);
                System.out.println(str1.capacity());

		str1.append("core2Web");
		System.out.println(str1);
                System.out.println(str1.capacity());
	}
}

