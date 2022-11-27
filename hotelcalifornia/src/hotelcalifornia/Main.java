package hotelcalifornia;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main extends Menu {
	

	public static void main(String[] args) {

		int userChoiceStart;
		
		Rooms room = new Rooms();
		String[] testroom = room.GetAllRoomFromCSV();

		do {

			userChoiceStart = startMenu();

			switch (userChoiceStart) {

			case 1:
				System.out.println("1");
				break;
			case 2:
				System.out.println("2");
				break;
			case 3:
				listOfRoomsMenu();
				break;
			case 4:
				System.out.println("Thanx for using my software. Seen yous soon later !");
				break;
			}

		} while (userChoiceStart != 4 && userChoiceStart != 3 && userChoiceStart != 2 && userChoiceStart != 1);


	}

}