package javaPractices;

public class ControlStatements {

	public static void main(String[] args) {
		// "If Else If" Statement:
		
		int marks = 25;
		if (marks>=35 && marks<=86) {
			System.out.println("Eligible for science stream");
		} 
		else if (marks>=35 && marks<=75) {
			System.out.println("Eligible for commerce stream");	
		} 
		else if (marks>=35 && marks <=60) {
			System.out.println("Eligible for arts stream");
		}
		
		else {
			System.out.println("Please repeat 10th");
		}

}
}
