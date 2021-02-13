/** This program allows the user to
 * store data of three different types
 * of clothing (pants, shirts, and shoes)
 * to compare if 2 of these objects are
 * the same, while adding up the price
 * of all the clothing objects in total.
 *
 * @author Harshil Shah
 * @version 1
 */

import java.util.Scanner;
import java.io.*;

public class ClothingTester {

    public static void main(String[] args) {

        String fileName = "C:\\Users\\shahp\\IdeaProjects\\Intro\\src\\data.txt"; //replace fileName with location of "data.txt" in your computer

        try {
            BufferedReader in = new BufferedReader(new FileReader(fileName));

            Scanner input = new Scanner(System.in);

            //declaration and initialization of variables (parsing to an Integer because data from "data.txt" is of type "String")
            int pantsCount = Integer.parseInt(in.readLine());
            int shirtsCount = Integer.parseInt(in.readLine());
            int shoesCount = Integer.parseInt(in.readLine());
            int objectCount = pantsCount + shirtsCount + shoesCount;
            int exitUserInput = 0;
            double totalPrice = 0;

            //creating a Clothing object called "newClothes"
            Clothing[] newClothes = new Clothing[objectCount];

            //creating Pants objects by reading the lines from "data.txt"
            for (int i = 0; i < pantsCount; i++) {
                String pantBrand = in.readLine();
                String pantColor = in.readLine();
                String pantType = in.readLine();
                double pantCost = Double.parseDouble(in.readLine());
                String sizeOfPant = in.readLine();
                boolean pantPockets = Boolean.parseBoolean(in.readLine());

                newClothes[i] = new Pants(pantBrand, pantColor, pantType, pantCost, sizeOfPant, pantPockets);
            }

            //creating Shirts objects by reading the lines from "data.txt"
            for (int i = pantsCount; i < (shirtsCount + pantsCount); i++) {
                String shirtBrand = in.readLine();
                String shirtColor = in.readLine();
                String shirtType = in.readLine();
                double shirtCost = Double.parseDouble(in.readLine());
                String sizeOfShirt = in.readLine();
                boolean shirtDesign = Boolean.parseBoolean(in.readLine());

                newClothes[i] = new Shirts(shirtBrand, shirtColor, shirtType, shirtCost, sizeOfShirt, shirtDesign);
            }

            //creating Shoes objects by reading the lines from "data.txt"
            for (int i = (shirtsCount + pantsCount); i < objectCount; i++) {
                String shoeBrand = in.readLine();
                String shoeColor = in.readLine();
                String shoeType = in.readLine();
                double shoeCost = Double.parseDouble(in.readLine());
                double sizeOfShoe = Double.parseDouble(in.readLine());
                boolean shoeLaces = Boolean.parseBoolean(in.readLine());

                newClothes[i] = new Shoes(shoeBrand, shoeColor, shoeType, shoeCost, sizeOfShoe, shoeLaces);
            }

            //prints out the "toString" from each object
            for (int i = 0; i < objectCount; i++) {
                System.out.println(i+1 + ": " + newClothes[i]);
            }

            //exits only when user enters "1"
            while(exitUserInput != 1) {

                //asks the user if they would want to exit the program
                System.out.print("Would you like to quit? (press 1 for yes/press 2 for no): ");
                exitUserInput = input.nextInt();

                if (exitUserInput == 1) {

                    System.out.println("Have a great day!"); //prints out the message once user quits
                    break;

                } else if (exitUserInput == 2) {

                    System.out.print("\nPlease enter an integer that corresponds to one of the objects above: ");
                    int userInput = input.nextInt();

                    while (userInput > objectCount || userInput <= 0) { //makes sure that the user enters an integer from the list
                        System.out.print("Not valid! Please enter an integer that corresponds to one of the objects above: ");
                        userInput = input.nextInt();
                    }
                    System.out.print("Please enter another integer that corresponds to another object above: ");
                    int userInput2 = input.nextInt();

                    while (userInput2 > objectCount || userInput2 <= 0) { //makes sure that the user enters an integer from the list
                        System.out.print("Not valid! Please enter an integer that corresponds to one of the objects above: ");
                        userInput2 = input.nextInt();
                    }

                    //compares the 2 objects the user chose
                    if ((newClothes[userInput - 1]).equals(newClothes[userInput2 - 1])) {

                        System.out.println("\nThese 2 objects are the same!");

                    } else {

                        System.out.println("\nThese 2 objects are NOT the same!");
                    }

                    //prints out the "toString" for the object the user chose
                    System.out.print("\nEnter an integer to view only one object: ");
                    int userInput3 = input.nextInt();

                    while (userInput3 > objectCount || userInput3 <= 0) {
                        System.out.print("Not valid! Please enter an integer that corresponds to one of the objects above: "); //makes sure that the user enters an integer from the list
                        userInput3 = input.nextInt();
                    }

                    System.out.println("\n" + newClothes[userInput3 - 1]); //prints the toString for the object the user chose

                    in.close();

                    //sums up the all the prices in the newClothes array
                    for (int i = 0; i < newClothes.length; i++) {
                        totalPrice += newClothes[i].getClothingPrice();
                    }

                    //prints out the total price of all the clothing
                    System.out.println("\nThe total price of all the clothing is: $" + totalPrice);
                    totalPrice = 0;
                }
            }

        } catch (IOException iox) {
            System.out.println("There is a problem reading " + fileName); //prints this message if fileName cannot be accessed
        }
    }
}