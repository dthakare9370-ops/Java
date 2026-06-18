class StringReverse{
	public static void main(String args[]){
		String str1 = "Ganesh";

		StringBuffer str2 = new StringBuffer(str1);
		System.out.println(str2);
		
		str2.reverse();
		System.out.println(str2);
	}
}

