package hotelcalifornia;

import java.util.Arrays;
import java.util.Scanner;

public class Menu {

    public static int startMenu() {

        int selection;
        Scanner input = new Scanner(System.in);

        System.out.println(
        		"\n"
        		+ "$$\\   $$\\            $$\\               $$\\        $$$$$$\\            $$\\ $$\\  $$$$$$\\                               $$\\           \n"
        		+ "$$ |  $$ |           $$ |              $$ |      $$  __$$\\           $$ |\\__|$$  __$$\\                              \\__|          \n"
        		+ "$$ |  $$ | $$$$$$\\ $$$$$$\\    $$$$$$\\  $$ |      $$ /  \\__| $$$$$$\\  $$ |$$\\ $$ /  \\__|$$$$$$\\   $$$$$$\\  $$$$$$$\\  $$\\  $$$$$$\\  \n"
        		+ "$$$$$$$$ |$$  __$$\\\\_$$  _|  $$  __$$\\ $$ |      $$ |       \\____$$\\ $$ |$$ |$$$$\\    $$  __$$\\ $$  __$$\\ $$  __$$\\ $$ | \\____$$\\ \n"
        		+ "$$  __$$ |$$ /  $$ | $$ |    $$$$$$$$ |$$ |      $$ |       $$$$$$$ |$$ |$$ |$$  _|   $$ /  $$ |$$ |  \\__|$$ |  $$ |$$ | $$$$$$$ |\n"
        		+ "$$ |  $$ |$$ |  $$ | $$ |$$\\ $$   ____|$$ |      $$ |  $$\\ $$  __$$ |$$ |$$ |$$ |     $$ |  $$ |$$ |      $$ |  $$ |$$ |$$  __$$ |\n"
        		+ "$$ |  $$ |\\$$$$$$  | \\$$$$  |\\$$$$$$$\\ $$ |      \\$$$$$$  |\\$$$$$$$ |$$ |$$ |$$ |     \\$$$$$$  |$$ |      $$ |  $$ |$$ |\\$$$$$$$ |\n"
        		+ "\\__|  \\__| \\______/   \\____/  \\_______|\\__|       \\______/  \\_______|\\__|\\__|\\__|      \\______/ \\__|      \\__|  \\__|\\__| \\_______|\n"
        		+ "                                                                                                                                  \n"
        		+ "                                                                                                                                  \n"
        		+ "                                                                                                                                  \n"
        		+ ""
        		);
        System.out.println("                                 ⚡ Hello and welcome to HotelCalifornia commande line project,");
        System.out.println("                                        please select an option below to get started. ⚡");
        System.out.println();
        System.out.println();
        System.out.println("                                        {             ♠ MENU SELECTION ♠           }");
        System.out.println();
        System.out.println("                                        [==========================================]");
        System.out.println("                                        [          [1] ADMINISTRATION PANEL        ]");
        System.out.println("                                        [              [2] BOOK A ROOM             ]");
        System.out.println("                                        [             [3] LIST OF ROOMS            ]");
        System.out.println("                                        [                  [4] EXIT                ]");
        System.out.println("                                        [==========================================]");
        System.out.println();
        System.out.println("                                        {          ♥ CREATED WITH HEARTH ♥         }");

        selection = input.nextInt();
        return selection;    
    }
    
    
    
    public static int listOfRoomsMenu() {
    	
    	
		Rooms room = new Rooms();
		String[] allRooms = room.GetAllRoomFromCSV();

        int selection;
        Scanner input = new Scanner(System.in);

        System.out.println(
        		"\n"
        		+ "$$\\   $$\\            $$\\               $$\\        $$$$$$\\            $$\\ $$\\  $$$$$$\\                               $$\\           \n"
        		+ "$$ |  $$ |           $$ |              $$ |      $$  __$$\\           $$ |\\__|$$  __$$\\                              \\__|          \n"
        		+ "$$ |  $$ | $$$$$$\\ $$$$$$\\    $$$$$$\\  $$ |      $$ /  \\__| $$$$$$\\  $$ |$$\\ $$ /  \\__|$$$$$$\\   $$$$$$\\  $$$$$$$\\  $$\\  $$$$$$\\  \n"
        		+ "$$$$$$$$ |$$  __$$\\\\_$$  _|  $$  __$$\\ $$ |      $$ |       \\____$$\\ $$ |$$ |$$$$\\    $$  __$$\\ $$  __$$\\ $$  __$$\\ $$ | \\____$$\\ \n"
        		+ "$$  __$$ |$$ /  $$ | $$ |    $$$$$$$$ |$$ |      $$ |       $$$$$$$ |$$ |$$ |$$  _|   $$ /  $$ |$$ |  \\__|$$ |  $$ |$$ | $$$$$$$ |\n"
        		+ "$$ |  $$ |$$ |  $$ | $$ |$$\\ $$   ____|$$ |      $$ |  $$\\ $$  __$$ |$$ |$$ |$$ |     $$ |  $$ |$$ |      $$ |  $$ |$$ |$$  __$$ |\n"
        		+ "$$ |  $$ |\\$$$$$$  | \\$$$$  |\\$$$$$$$\\ $$ |      \\$$$$$$  |\\$$$$$$$ |$$ |$$ |$$ |     \\$$$$$$  |$$ |      $$ |  $$ |$$ |\\$$$$$$$ |\n"
        		+ "\\__|  \\__| \\______/   \\____/  \\_______|\\__|       \\______/  \\_______|\\__|\\__|\\__|      \\______/ \\__|      \\__|  \\__|\\__| \\_______|\n"
        		+ "                                                                                                                                  \n"
        		+ "                                                                                                                                  \n"
        		+ "                                                                                                                                  \n"
        		+ ""
        		);
        System.out.println();
        for(int i = 0; i< allRooms.length; i++) {
        	System.out.println(allRooms[3]);
        }
        System.out.println(Arrays.toString(allRooms));
        selection = input.nextInt();
        return selection;   
    }
    
    public static int adminMenu() {

        int selection;
        Scanner input = new Scanner(System.in);


        System.out.println("Choose from these choices");
        System.out.println("===============================================================\n");
        System.out.println("1 - Add Room");
        System.out.println("2 - Delete Room");
        System.out.println("3 - Update Room");
        System.out.println("4 - Return main menu");
        System.out.println("===============================================================\n");

        selection = input.nextInt();
        return selection;    
    }
}
