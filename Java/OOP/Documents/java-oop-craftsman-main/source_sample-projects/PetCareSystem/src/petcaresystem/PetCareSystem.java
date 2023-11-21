package petcaresystem;

import data.Cabinet;
import ui.Menu;

/**
 *
 * @author giao-lang | fb/giao.lang.bis | fb/bmag.vn
 * version 18.03
 */

//menu chính của app.
public class PetCareSystem {

    public static void main(String[] args) {
        Menu menu = new Menu("Happiness Pet Care System");
        menu.addNewOption("1. Add a new dog profile");
        menu.addNewOption("2. Add a new cat profile");
        menu.addNewOption("3. Search a pet profile by id");
        menu.addNewOption("4. Update a pet profile by id");
        menu.addNewOption("5. Remove a pet profile by id");
        menu.addNewOption("6. Print the pet list ascending by id");
        menu.addNewOption("7. Print the pet list ascending by name");
        menu.addNewOption("8. Quit");
       
        Cabinet cage = new Cabinet(); 
        //mua cái tủ, đựng hồ sơ Pet. Tủ có thể thêm/xóa/sửa/tìm/sort
        //các hồ sơ mà nó chứa bên trong        
        int choice;
        do {
            menu.printMenu();
            choice = menu.getChoice();
            switch (choice) {
                case 1:
                    System.out.println("You are preparing to "
                            + "input a new dog profile");
                    cage.addNewDog();
                    break;
                case 2:
                    System.out.println("You are preparing to "
                            + "input a new cat profile");
                    cage.addNewCat();
                    break;                    
                case 3:
                    System.out.println("You are required to input "
                            + "a pet id to search");
                    cage.searchPetByID();
                    break;
                case 4:
                    System.out.println("You are required to input "
                            + "a pet id to update");
                    cage.updatePet();
                    break;
                case 5:
                    System.out.println("You are required to input "
                            + "a pet id to remove");    
                    cage.removePet();
                    break;
                case 6:
                    System.out.println("You are preparing to "
                            + "print the pet list ascending by id");
                    cage.printPetListAscendingByID();
                    break;
                case 7:
                    System.out.println("You are preparing to "
                            + "print the pet list ascending by name");
                    cage.printPetListAscendingByName();
                    break;    
                case 8:
                    System.out.println("Bye bye, see you next time!");
                    break;
            }
        } while (choice != 8);
    }
}
