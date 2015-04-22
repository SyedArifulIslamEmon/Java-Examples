
public class Cse {
	private String Id ;
	private String name ;
	
	private char gender;

	public Cse(String id, String name, char gender) {
		
		Id = id;
		this.name = name;
		this.gender = gender;
	}

	@Override
	public String toString() {
		return "Cse [Id=" + Id + ", name=" + name + ", gender=" + gender + "]";
	}

	public String getId() {
		return Id;
	}

	public void setId(String id) {
		Id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}
	

}
