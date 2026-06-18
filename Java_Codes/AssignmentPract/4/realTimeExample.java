import java.util.*;
class realTimeExample{
        public static void main(String args[]){
                Scanner sc = new Scanner(System.in);
		System.out.println("*** Sign In ****");
                System.out.println("Enter UserName for Set in Databse :- ");
                String userName = sc.next();
		System.out.println("Enter Password for Set in Database :- ");
		String pass = sc.next();


		System.out.println("");
		
		while(true){
			System.out.println("*****Login****");
			System.out.println("Enter UserName :- ");
			String newUser = sc.next();
			System.out.println("Enter Password :- ");
			String newPass = sc.next();

			System.out.println();	
                	if(userName.equals(newUser)){
			
				if(pass.equals(newPass)){

					System.out.println("Login Successfully !!");
					break;
				}else{
	
					System.out.println("Invalide Password !!");
				}
			}else{
        	                System.out.println("Invalide UserName and Password !! ");
               		}
		}


        }
}
