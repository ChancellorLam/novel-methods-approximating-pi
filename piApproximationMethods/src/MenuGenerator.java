package piApproximationMethods;

public class MenuGenerator {

	int selectionMenu(String prompt, String[] options) {
		boolean selectionNotMade = true;
		int validSelection = -1;
		
		while (selectionNotMade) {
			InputTaker inputTaker = new InputTaker();

			// print out menu options
			System.out.println(prompt);
			for (int i = 0; i < options.length; i++) {
				System.out.println("[" + i + "] " + options[i]);
			}

			int selection = inputTaker.takeMenuSelection();
			if (selection >= 0 && selection < options.length) {
				validSelection = selection;
				selectionNotMade = false;
			}
			else {
				System.out.println("Invalid input. You must make a choice between 0 and " + (options.length - 1) + ".");
				System.out.println();
			}
		}
		return validSelection;
	}
}
