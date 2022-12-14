package sintaxeVarFluxo;

public class TestModule {
	public static void main(String[] args) {
		for(int count = 0; count <= 100; count++) {
			if(count % 3 == 0) {
				System.out.println("The number "+count+" is divisible by 3.");
			}
		}
	}
}
