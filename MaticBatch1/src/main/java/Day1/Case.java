package Day1;

public class Case {
	
	public static void main(String[] args) {
		String rang="r";		
		String ColorChoice = null;
		
		switch (rang) {
		
		case "r":
			ColorChoice= "Red";
			break;
		
		case "b":
			ColorChoice= "Blue";
			break;
		
		case "g":
			ColorChoice= "Green";
			break;
		case "defult":
			ColorChoice="Invalid color";
			break;
		
		}
		
		System.out.println("Your color of Choice is: "+ ColorChoice);
		
	}

}
