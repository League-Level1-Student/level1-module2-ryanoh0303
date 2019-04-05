package smurf;

public class Runner {

	public static void main(String[] args) {
		Smurf HandySmurf= new Smurf("Papa Smurf");
		System.out.println(HandySmurf.getName());
		HandySmurf.getHatColor();
		HandySmurf.isGirlOrBoy();
		
		
		
		Smurf HandySmurf2= new Smurf("Smurfette");
		System.out.println(HandySmurf2.getName());
		HandySmurf2.getHatColor();
		HandySmurf2.isGirlOrBoy();
		
	}

}
