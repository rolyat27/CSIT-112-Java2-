import java.util.*;

public class Car {
	Scanner scan = new Scanner(System.in);

	private int modelYear;
	private double currentValue;
	private double purchasePrice;
	private int currentYear;
	private double depreciationRate = 0.15;
	private int carAge;

	public void setModelYear(int userYear) {
		modelYear = userYear;
	}

	public int getModelYear() {
		return modelYear;
	}
	public void setPurchasePrice(double userPrice) {
		purchasePrice = userPrice;
	}
	public double getPurchasePrice() {
		return purchasePrice;
	}

	public double calCurrentValue(int userYear, int userCurrentYear) {
		currentYear = userCurrentYear;
		carAge = userCurrentYear - userYear;
		currentValue = purchasePrice;
		while (carAge > 0) {
			currentValue = currentValue * (1-depreciationRate);
			carAge --;
		}
		return currentValue;
	}
	public void printInfo() {
		System.out.println("Model Year: " + modelYear);
		System.out.println("Purchase Price: " + purchasePrice);
		System.out.println("Current Value: " + currentValue);
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Car myCar = new Car();
		double NewValue;	
		System.out.println("enter the manufacture year of the car: ");
		int userYear = scan.nextInt();

		System.out.println("enter the initial price of the car: ");
		double userPrice = scan.nextDouble();

		System.out.println("enter the current year: ");
		int userCurrentYear = scan.nextInt();

		myCar.setModelYear(userYear);
		myCar.setPurchasePrice(userPrice);
	 	myCar.calCurrentValue(userYear, userCurrentYear);
		myCar.printInfo();
	}
}

