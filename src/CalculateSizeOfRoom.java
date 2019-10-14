import java.util.Scanner;

public class CalculateSizeOfRoom {
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		boolean next_room;
		do {
			
//			Asks for user input
			System.out.println("Please enter the length of the room (in feet): ");
			float length = scnr.nextFloat();
			System.out.println("Please enter the width of the room (in feet): ");
			float width = scnr.nextFloat();
			
//			Calculates and prints out the area and perimeter of a room
			float area = width * length;
			float perimeter = 2 * (length + width);
			System.out.println("The area of the room is: " + area);
			System.out.println("The perimeter of the room is: " + perimeter);	
			
//			Asks if the user wants to move on to the next room or finish the session
//			It sets the appropriate boolean for the do while loop
			System.out.println("Continue? (y/n)");
			char response = scnr.next().charAt(0);
			if (response == 'y' || response == 'Y') {
				next_room = true;
			}
			else {
				next_room = false;
				System.out.println("Thank you for using our services! Bye now.");
			}
		}
		while (next_room);
		scnr.close();
	}
}
