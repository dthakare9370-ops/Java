class StringDemo3_Pluse_Opration{
	public static void main(String args[]){
		String str1 = "Ganu";  //SCP mean String Constant Pull
		String str2 = "Thakare"; //Scp

		String str3 = str1+str2;//heap
		
		//जर String var kontehi operation kel tar ti string heap var jate bycode check karu shakto 
		       	
		String str4 = "GanuThakare"; // heap
		System.out.println(str3==str4);
	}
}
