package sintaxeVarFluxo;

public class ConditionalsExercise {
	public static void main(String[] args) {
		
		double salary = 3300.0;
		
		if (salary >=  1900.0 && salary <= 2800.0) {
			System.out.println("Your contribution is 7.5% (R$142)");
		}else if(salary >= 2800.01 && salary <= 3751.0) {
			System.out.println("Your contribution is 15%(R$350)");
		}else if(salary >= 3751.01 && salary <= 4664.00) {
			System.out.println("Your contribution is 22.5%(R$636)");
			}
	}
}
		
		
