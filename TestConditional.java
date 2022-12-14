package sintaxeVarFluxo;

public class TestConditional {
	public static void main(String[] args) {
		System.out.println("Testing conditionals");

		int age = 17;
		int peopleNumber = 1;
		if (age >= 18) {
			System.out.println("You have 18+");
			System.out.println("Welcome");
		}
		else {
			if(peopleNumber >= 2) {
				System.out.println("You dont have 18+, but can enter");
			}else {
			System.out.println("No, you dont have 18+, and dont have "
					+ "companion");
			}
		}
	}
}
