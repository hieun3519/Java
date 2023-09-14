package src;

import java.util.Scanner;
import java.util.*;    // import whole java libary

public class Animal {
    // static -shared by every animal object
    // final -const and can't be change
    public static final double FAVNUMBER =1.6180;
    private String name;
    private int weight;
    private boolean hasOwner = false;
    private byte age;
    private long uniqueID;
    private char favoriteChar;
    private double speed;
    private float height;

    // only access by other code in the package
    protected static int numberOfAnimals =0;

    // get data from user input
    static Scanner userInput = new Scanner(System.in); 

    public Animal(){
        // call what ever the super class to be executed which is animal
        // super(); 
        numberOfAnimals++;

        int sumOfNumbers = 5+1;
        System.out.println("5 + 1 = " + sumOfNumbers);

        System.out.print("Enter the name: \n");


        if(userInput.hasNextLine()){
            // this refer to the object being created
            this.setName(userInput.nextLine());
        }

        this.setFavoriteChar();
        this.setUniqueID();;

    }
// getters and setters
public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public boolean isHasOwner() {
        return hasOwner;
    }

    public void setHasOwner(boolean hasOwner) {
        this.hasOwner = hasOwner;
    }

    public byte getAge() {
        return age;
    }

    public void setAge(byte age) {
        this.age = age;
    }

    public long getUniqueID() {
        return uniqueID;
    }

    public void setUniqueID(long uniqueID) {
        this.uniqueID = uniqueID;
        System.out.println("Unique ID set to: " + this.uniqueID);
    }

    public void setUniqueID() {
        long minNumber = 1;
        long maxNumber = 1000000;

        this.uniqueID = minNumber + (long)(Math.random() * ((maxNumber - minNumber) +1));
        String stringNumber = Long.toString(maxNumber);  // convert long to string

        int numberString = Integer.parseInt(stringNumber); // convert to integer

        }

    public char getFavoriteChar() {
        return favoriteChar;
    }

    public void setFavoriteChar(char favoriteChar) {
        this.favoriteChar = favoriteChar;
    }

    public void setFavoriteChar() {
        int randomNumber = (int)(Math.random() * 126) + 1;

        this.favoriteChar = (char) randomNumber;
        if(randomNumber ==32){
            System.out.println("Favorite character set to Space");
        }
        if(randomNumber ==10){
            System.out.println("Favorite character set to New line");
        }
        else{
            System.out.println("Favorite character set to this " + this.favoriteChar);
        }

        if((randomNumber > 97) && (randomNumber <122)){
            System.out.println("Favorite character is lowercase letter");
        }
        if((randomNumber > 97) && (randomNumber <122) || ((randomNumber > 64) && (randomNumber <91))){
            System.out.println("Favorite character is letter");
        }
        int whichIsBigger = (50 > randomNumber) ? 50 : randomNumber; // ? = if else so if 50 else randomNumber
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }
    protected static void countTo(int startingNumber){
        for(int i = startingNumber; i <= 100; i++){
            if(i ==90) continue;
            System.out.println(i);
        }
    }
    protected static String printNumbers(int maxNumber){
        int i= 1;
        while(i < (maxNumber /2)){
            System.out.println(i);
            i++;
        }
        Animal.countTo(maxNumber/2);
        return "End of printNumbers";
    }

    protected static void guessMyNumber(){
        int number;
        do {
            System.out.println("Guess Number up to 100");
            while(!userInput.hasNextInt()){
                String numberEntered = userInput.next();
                // %s string %d int, byte, short %f -double %.2f to the .2 decimal 
                System.out.printf("%s is not a number\n", numberEntered);
            }
            number = userInput.nextInt();
        }while(number !=50);
    }

    // polymorphism
    public String makeSound(){
        return "Grrr";
    }
    public static void speakAnimal(Animal randAnimal){
        System.out.println("Animal says " + randAnimal.makeSound());
    }
public static void main(String[] args){
    Animal theAnimal = new Animal(); // creating new animal object

    int[] favoriteNumber = new int[20];
    favoriteNumber[0] = 100;
    
}
}