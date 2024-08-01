package javaPractices;

public class NestedIFstatement {

	public static void main(String[] args) {
		int workingdays=10;
		
		
		if (workingdays==7) {
			System.out.println("Extra working days");
		}
		else if(workingdays==6) {
			System.out.println("Somewhat extra working days");
		}
		else if(workingdays==5) {
			System.out.println("Standard working days");
		}
		else if(workingdays==2) {
			System.out.println("Loss of Pay");
		}
		
			else{
				System.out.println("Vaccation for a week");
			}
	}
}
