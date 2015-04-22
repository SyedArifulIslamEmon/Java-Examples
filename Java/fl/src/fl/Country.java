package fl;


public class Country{

	  private String name;
	  private Flag flag;

	  public Country(String name, Flag flag){
		this.name = name;
		this.flag = flag;
	  }

	  public void display(){
		flag.display();
		System.out.println("Name: "+name);
	  }

	  public static void main(String []args){
		Flag f = new Flag("Bangladesh", "Green-Red");
		//Country c = new Country("Bangladesh"); //error
		Country c = new Country("Bangladesh", f);     //ata hoba
		//or ata hoba
		Country c2 = new Country("Bangladesh",new Flag("Bangladesh","greeen-----red"));//
		c.display();
	  }
	}
