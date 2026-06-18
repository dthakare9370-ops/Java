class SwitchDemoArrayOP2{
        public static void main(String args[]){
                int a= 2 ;
		//The yield keyword is used to return a value from a switch expression. Below is the correct syntax
                
		

		String result = switch(a){
			case 1 : yield "One";
			case 2 : yield "Tow";
			default : yield "Invalide Choice";
                };

		System.out.println(result);
        }
}
