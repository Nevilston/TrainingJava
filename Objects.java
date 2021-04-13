
import java.util.Scanner;

class Methods {

	String animal;
	int value;
	int Months;

	void run() {
		System.out.println("Running");
		for (int i = 0; i < 4; i++) {
			System.out.println("My " + animal + " is " + value + " years old.");
		}
	}

	int CalculationMonthsToBithday() {
		int MonthsLeft = 12 - Months;
		return MonthsLeft;
	}

	void talk(String text) {
		System.out.println(text);
	}

	void walk(int speed) {
		System.out.println("Walking " + speed + " Km Per Hour");
	}
}

class Nevil {
	public static void methods() {
		System.out.println("Nevil");
	}

}

public class Objects {

	public static void main(String[] args) {

		Methods name = new Methods();
		name.animal = "Cat";
		name.value = 9;
		// name.run();
		name.Months = 9;
		Scanner Input = new Scanner(System.in);
		System.out.println("Enter Value ");
		int aValue = Input.nextInt();
		System.out.println("The value Entered BY the User is " + aValue);
		;
		name.talk("Hi i am Nevilston");
		name.walk(7);
		int Months = name.CalculationMonthsToBithday();
		System.out.println("Birthday Months " + Months);

		Nevil.methods();
	}
}
