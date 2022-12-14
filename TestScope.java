package sintaxeVarFluxo;

public class TestScope {
	public static void main(String[] args) {
		System.out.println("Testing conditionals");

		int age = 15;
		int friendsNumber = 3;
		
		boolean haveFriends = friendsNumber >= 2;
		
			System.out.println("haveFriends value= " + haveFriends);
		
		if (age >= 18 && haveFriends) {
			System.out.println("You have 18+");
			System.out.println("Welcome");
		}
		else {
			System.out.println("You dont have 18+, cant enter");
			}
		
		}
	}