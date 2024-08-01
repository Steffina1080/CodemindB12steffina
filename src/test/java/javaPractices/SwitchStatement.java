package javaPractices;

public class SwitchStatement {

	public static void main(String[] args) {
		String Menu ="IdliChutney";
		
		switch (Menu) {
		case "Dhokala":
			System.out.println("The Given menu is Dhokala");
			break;
			
		case "PuriSabji":
			System.out.println("The Given menu is PuriSabji");
			break;
			
		case "Gulabjamun":
			System.out.println("The Given menu is Gulabjamun");
			break;
			
		default:
			System.out.println("There is no menu available");
			break;
		}

	}

}
