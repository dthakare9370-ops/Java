class StringDemo4_ConcateMethod{
	public static void main(String args[]){
		String str1 = "Ganu"; //scp
		String str2 = "Thakare"; //scp
		
		String str3 = str1.concat(str2); // heap la jail string var kontehi popration kel tari ti heap la jate
		
		System.out.println(str3);

		String str4 = "GanuThakare";
		str3=str3.intern();
		System.out.println(str3==str4);
	}
}
