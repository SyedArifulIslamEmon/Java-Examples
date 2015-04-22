package MidTerm;

public class Doctor {
	private String ID;
	private String name;
	private String cellon;
	private String hospital;

	public Doctor(String ID, String name, String cellon) {

		this.ID = ID;
		this.name = name;
		this.cellon = cellon;

	}

	public void setHospital(String hospital) {
		this.hospital = hospital;

	}

	public String getHospital() {

		return hospital;
	}

	public void dispaly() {
		System.out.println("ID : " + ID + "\nName : " + name + "\nCellon : "
				+ cellon + "\nHospital : " + getHospital());

	}

}
