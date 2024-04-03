package piApproximationMethods;
import java.util.Scanner;

public class ProgramManager {
	static Scanner input = new Scanner(System.in);

	void approximatePi() {
		String prompt = "What method would you like to use in order to approximate pi?";
		String[] options = {"Archimedes' Method", "Madhava-Leibniz Infinite Series", "Newton's Method",
				"Monte-Carlo Method", "Ramanujan-Sato Series", "Chudnovsky Algorithm", "Exit"};
		boolean continueRunning = true;
		MenuGenerator mainMenu = new MenuGenerator();
		while (continueRunning) {
			int choice = mainMenu.selectionMenu(prompt, options);
			PiApproximator piApproximator = new PiApproximator();
			if (choice == 0) {
				piApproximator.archimedesMethod();
			}
			else if (choice == 1) {
				piApproximator.madhavaLeibniz();
			}
			else if (choice == 2) {
				piApproximator.newtonsMethod();
			}
			else if (choice == 3) {
				piApproximator.monteCarlo();
			}
			else if (choice == 4) {
				piApproximator.ramanujanSato();
			}
			else if (choice == 5) {
				piApproximator.chudnovskyAlgorithm();
			}
			else if (choice == 6) {
				continueRunning = false;
			}
			else {
				System.out.println("Invalid input. Please choose from the 5 available options.");
				System.out.println();
			}
			String actualPi = "3.1415926535897932384626433832795";
			System.out.printf("Actual value of pi: %s\nPress Enter to Continue.", actualPi);
			input.nextLine();
		}
	}
}
