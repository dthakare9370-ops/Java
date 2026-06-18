import java.util.*;
class ProfitLoss{
        public static void main(String args[]){
                Scanner sc = new Scanner(System.in);
                System.out.println("Enter SellingPrice : - ");
                int sellPrice = sc.nextInt();
		System.out.println("Enter CostPrice :- ");
		int costPrice = sc.nextInt();

		sellPrice = sellPrice - costPrice;	
                
		if(sellPrice==0){
			System.out.println("No profit no Loss");
		}else if(sellPrice<0){
			System.out.println("Loss of "+sellPrice);
		}else{
			System.out.println("Profit of "+sellPrice);
		}
        }
}
