
public class Askme implements Shared {
	
	static void answer(int result){
		
		switch (result) {
		case no:
			System.out.println("-----------NO-----------");
			break;

		case yes:
			System.out.println("-----------YES-----------");
			break;
		case later:
			System.out.println("-----------lATER-----------");
			break;
		case soon:
			System.out.println("-----------SOON-----------");
			break;
		case never:
			System.out.println("-----------NEVER-----------");
			break;
		
		
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Ques ques=new Ques();
		answer(ques.ask());
	}

}
