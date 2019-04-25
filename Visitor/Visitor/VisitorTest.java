package Visitor;

public class VisitorTest {

	public static void main(String[] args) {
		TaxVisitor taxCalc = new TaxVisitor();
		TaxHolidayVisitor taxHolidayCalc = new TaxHolidayVisitor();

		Necessity milk = new Necessity (3.47);
		Liquor vodka = new Liquor (11.99);
		Tobacco cigars = new Tobacco (19.99);

		System.out.println("REGUALR TAX PRICES\n");
		
		System.out.println("Milk: " + milk.accept(taxCalc) + "\n");
		System.out.println("Vodka: " + vodka.accept(taxCalc) + "\n");
		System.out.println("Cigar: " + cigars.accept(taxCalc) + "\n");

		System.out.println("HOLIDAY TAX PRICES\n");
		
		System.out.println("Milk: " + milk.accept(taxHolidayCalc) + "\n");
		System.out.println("Vodka: " + vodka.accept(taxHolidayCalc) + "\n");
		System.out.println("Cigar: " + cigars.accept(taxHolidayCalc) + "\n");
	}
	
}
