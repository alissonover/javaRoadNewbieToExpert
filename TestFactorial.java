package sintaxeVarFluxo;

public class TestFactorial {
	public static void main(String[] args) {
		for(int n = 1; n <= 10; n++) {
			System.out.println(n + " factorial is " + (n*(n-1)*(n-2)));
		}
	}
}
