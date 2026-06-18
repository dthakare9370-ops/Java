class StringReverse1{
	public static void main(String args[]){
		String str1 = "ganesh";

		StringBuffer str2 = new StringBuffer(str1);
		str2.reverse();

		System.out.println(str1);
		str1 = str2.toString();

		System.out.println(str1);
	}
}
