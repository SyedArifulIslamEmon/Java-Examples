package fl;

class Flag{
	  
	  private String color;
	  private String name;

	  public Flag(String name, String color){
		this.name = name;
		this.color = color;
	  }

	  public void display(){
		System.out.println("Name: "+name);
		System.out.println("Color: "+color);
	  }
	}
