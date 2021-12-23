
public class AccountingArrayApp {

	public static void main(String[] args) {
		//String -> Double change ==> Double.parseDouble();
		double valueOfSupply = Double.parseDouble(args[0]);
		double vatRate = 0.1;
		double expenseRate = 0.3;
		double vat = valueOfSupply*vatRate;
		double total = valueOfSupply+vat;
		double expense = valueOfSupply * expenseRate;
		double income = valueOfSupply - expense;
		double dividend1 = income * 0.5;
		double dividend2 = income * expenseRate;
		double dividend3 = income * 0.2;
		
		double[] dividendRates = new double[3];
		dividendRates[0] = 0.5;
		dividendRates[1] = 0.3;
		dividendRates[2] = 0.2;
		
		for(int i=0; i<3; i++) {
			System.out.println("dividendRates : " + dividendRates[i]);	
		}
		
		int j = 0;
		while(j<dividendRates.length) {
			System.out.println("DividendRates : " + dividendRates[j]);
			j = j+1;
		}
		
		System.out.println("Value of supply : "+valueOfSupply);
		System.out.println("VAT : " +vat);
		System.out.println("Total : " +total);
		System.out.println("Expense : "+expense);
		System.out.println("Income : "+income);
		
		System.out.println("Dividend 1 : "+ dividend1);
		System.out.println("Dividend 2 : "+ dividend2);
		System.out.println("Dividend 3 : "+ dividend3);
	}
}
