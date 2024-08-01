package javaPractices;


class Buildings {
	
	int noOfBuildings = 5;
	String nameOfBuildings = "Dhanashree Heights, Drishti Apartment, Gods Gift Apartment";
	String nameOfColony = "Gurukrupa";
	int noOfFloorsPerBuilding = 7;
	float howManyYearsPassedForConstruction = 2.5f;
	String area = "Wanowrie";
	
	
	void DevelopedArea() {
		System.out.println("The area is well developed.");
	}
	
	void NotDeveloped() {
		System.out.println("The area is not well developed");
	}
}

public class BuildingsClass {

	public static void main(String[] args) {
		
		Buildings b1 = new Buildings();
		
		System.out.println("NoOfBuildings: "+ b1.noOfBuildings);
		System.out.println("nameOfBuildings: "+b1.nameOfBuildings);
		System.out.println("nameOfColony: "+ b1.nameOfColony);
		System.out.println("noOfFloorsPerBuilding: "+b1.noOfFloorsPerBuilding);
		System.out.println("howManyYearsPassedForConstruction: "+ b1.howManyYearsPassedForConstruction);
		System.out.println("area: "+ b1.area);
		
		b1.DevelopedArea();
		b1.NotDeveloped();
	}

}
