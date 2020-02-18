package pizza;

public class Pizza {
	
	boolean orderPizza(int quantity, String type) {		
		if(quantity<1) {
			System.out.println("Quantity can not be less than 1");
			return false;
		}
		else if(quantity>10) {
			System.out.println("Quantity can not be more than 10");
			return false;
		}
		else {
			// quantity in [1..10]
			if(type.equals("a")) {
				System.out.println("You have successfully ordered "+ quantity +" pizza(s) of type a");
				return true;
			}
			else if(type.equals("b")) {
				System.out.println("You have successfully ordered "+ quantity +" pizza(s) of type b");
				return true;
			}
			else if(type.equals("c")) {
				System.out.println("You have successfully ordered "+ quantity +" pizza(s) of type c");
				return true;
			}
			else {
				System.out.println("Invalid pizza type");
				return false;
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
