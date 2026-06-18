class SetStringBuffCapacity{
	public static void main(String arhs[]){
		StringBuffer str1 = new StringBuffer(20);
		System.out.println(str1.capacity());
		
		str1.append("Core2Web");

		str1.append("Core2Web");

		System.out.println(str1.capacity());

		str1.append("Core2Web");

                System.out.println(str1.capacity());
	}
}
