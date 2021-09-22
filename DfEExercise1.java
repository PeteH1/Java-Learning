public class DfEExercise1 {

	public static void main(String[] args) {
		
		boolean isEdselHappy = true; // Creating a variable that stores a boolean
		
		int weight = 20; // Weight is being stored as an integer with value 20 
		String name = "Billy Bob"; // Creating a variable called name with the name "Billy Bob" stored
		Dog goodBoy = new Dog(name, weight); // Creating an instance of the Dog class, called "goodBoy"
		int x = weight - 10; // Creating a variable called "x" with the value of 10 less than the "weight" variable
		if (x < 15) goodBoy.bark(); // If loop that calls the "bark" method for goodBoy if x < 15
		
		while (x < 3) { // A while loop that calls the "play" method for goodBoy while x < 3
			goodBoy.play();
		}
		
		int[] numList = {1,2,3,4,5,6}; // Creating a list of integers 1 to 6 called "numList"
		System.out.println("How are you"); // Prints out "How are you" etc. and includes the "name" variable which is set to "Billy Bob" already
		System.out.println("My " + name + " is doing great"
				+ " how's yours");
		String num = "305"; // Creates a string variable called "num" and sets it to "305"
		int z = Integer.parseInt(num); // Turns "num" from a string into an integer
		
	}

		
	}