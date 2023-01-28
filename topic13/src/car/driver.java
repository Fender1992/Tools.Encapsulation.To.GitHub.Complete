package car;

public class driver {
	private int driverAge;
	private int driverHeightInches;
	private String driverTeam;
	private String driverName;
	
	public void driverAttributes(int driverAge, int driverHeightInches, String driverTeam, String driverName) {
		this.driverAge = driverAge;
		this.driverHeightInches = driverHeightInches;
		this.driverTeam = driverTeam;
		this.driverName = driverName;
	}
	
	
	public int getDriverAge() {
		return driverAge;
	}


	public void setDriverAge(int driverAge) {
		this.driverAge = driverAge;
	}


	public int getDriverHeightInches() {
		return driverHeightInches;
	}


	public void setDriverHeightInches(int driverHeightInches) {
		this.driverHeightInches = driverHeightInches;
	}


	public String getDriverTeam() {
		return driverTeam;
	}


	public void setDriverTeam(String driverTeam) {
		this.driverTeam = driverTeam;
	}


	public String getDriverName() {
		return driverName;
	}


	public void setDriverName(String driverName) {
		this.driverName = driverName;
	}


	public driver() {
		
		System.out.println("Hi! My name is Rolando and I am ready to race." );
		System.out.println();
		System.out.println("Let's start by checking the psi of the tires.");
		System.out.println();
	}

}

