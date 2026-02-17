package factoryPattern;

import java.util.Scanner;

public class Clinic {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.println("\nChoose pet");
            System.out.println("[1] Dog");
            System.out.println("[2] Cat");
            System.out.println("[3] Exit");
            System.out.print("Enter number choice: ");
            int choice = input.nextInt();

            PetRecord petRecord = new PetRecord();
            Pet pet = null;

            switch(choice){
                case 1:
                    pet = new Dog();
                    petRecord.setPetId("D01");
                    petRecord.setPetName("Bantay");
                    petRecord.setPet(pet);
                    ((Dog) pet).setBreed("German Shepherd");
                    break;
                case 2:
                    pet = new Cat();
                    petRecord.setPetId("C01");
                    petRecord.setPetName("Muning");
                    petRecord.setPet(pet);
                    ((Cat) pet).setNoOfLives(9);
                    break;
                case 3:
                    System.out.println("Exiting program...");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Try again.");
                    continue;
            }
            
            System.out.println("Pet id is " + petRecord.getPetId());
            System.out.println("Pet name is " + petRecord.getPetName());
            System.out.println("Pet kind: " + petRecord.getPet().getClass().getSimpleName());
            System.out.println("Communication sound: "+ petRecord.getPet().makeSound());
            System.out.println("Play mode: " + petRecord.getPet().play());
            if (pet instanceof Dog) {
                System.out.println("Breed: " + ((Dog) pet).getBreed());
            } else if (pet instanceof Cat) {
                System.out.println("Number of Lives: " + ((Cat) pet).getNoOfLives());
            }
        }
    }
}
