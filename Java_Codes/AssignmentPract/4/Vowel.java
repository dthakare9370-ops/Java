import java.util.*;
class Vowel{
        public static void main(String args[]){
                Scanner sc = new Scanner(System.in);
                //System.out.println("Enter Charactor :- ");
                char ch = 'a';

		if(ch == 'a' || ch =='e' || ch=='i' || ch=='o' || ch =='u' ){
			System.out.println(ch + " is Vowel");
		}else if(ch == 'A' || ch =='E' || ch=='I' || ch=='O' || ch =='U'){
			System.out.println(ch + " is Vowel");
		}else{
			System.out.println(ch + " is Consonant");
		}

                
        }
}
