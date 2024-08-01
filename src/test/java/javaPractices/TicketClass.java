package javaPractices;

class Ticket {

	int ticketNo = 1;
	String nameOfProperty = "Hotel Conrade";
	String problemFaced = "Internet Connection Down";
	String time = "11:03f";
	String abbrev = "am";
	String problemLevel = "High Priority";
	String status = "Resolved";

	void Down() {
		System.out.println("The Internet connection is down..");
	}

	void Restored() {

		System.out.println("The Internet connection is restored..");
	}

}

public class TicketClass {

	public static void main(String[] args) {
		Ticket t1 = new Ticket();

		System.out.println("ticketno:" + t1.ticketNo);
		System.out.println("nameOfProperty:" + t1.nameOfProperty);
		System.out.println("problemFaced:" + t1.problemFaced);
		System.out.println("time:" + t1.time);
		System.out.println("Abbrevation:" + t1.abbrev);
		System.out.println("problemLevel:" + t1.problemLevel);
		System.out.println("Status:" + t1.status);
		t1.Down();
		t1.Restored();

	}

}
