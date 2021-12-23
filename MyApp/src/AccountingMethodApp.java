
public class AccountingMethodApp {
	public static double test = 10000.0;
	public static double valueOfSupply;
	public static double vatRate;
	public static double expenseRate;
	public static double total;
	
	public static void main(String[] args) {
		valueOfSupply = 10000.0;
		vatRate = 0.1;
		expenseRate = 0.3;
		double vat = getVAT(valueOfSupply, vatRate);
		double vat2 = getVAT2();
		//double vat = getVAT(valueOfSupply, vatRate);
		total = getTotal(vat);
		double expense = valueOfSupply * expenseRate;
		double income = valueOfSupply - expense;
		double dividend1 = income * 0.5;
		double dividend2 = income * expenseRate;
		double dividend3 = income * 0.2;
		
		System.out.println("Value of supply : "+valueOfSupply);
		System.out.println("VAT : " +vat);
		System.out.println("Total : " +total);
		System.out.println("Expense : "+expense);
		System.out.println("Income : "+income);
		
		System.out.println("Dividend 1 : "+ dividend1);
		System.out.println("Dividend 2 : "+ dividend2);
		System.out.println("Dividend 3 : "+ dividend3);
		
		System.out.println(vat2);
	}

	public static double getTotal(double vat) {
		return valueOfSupply+vat;
	}

	private static double getVAT(double valueOfSupply, double vatRate) {
		return valueOfSupply*vatRate;
	}
	private static double getVAT2() {
		return test+getInCome(2);
	}
	public static double getInCome(double a) {
		return test * a;
	}
}
