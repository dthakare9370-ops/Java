class FoodOrder{

	void orderFood(){
		System.out.println("Going to restaurant and ordering food.");
	}

}

class ZomatoFoodOrder extends FoodOrder{

	void orderFood(){
		System.out.println("\nOrdering food using the Zomato App or Website\n");
	}

}

class Client{
	public static void main(String args[]){
		FoodOrder obj = new ZomatoFoodOrder();
		obj.orderFood();
	}
}	


