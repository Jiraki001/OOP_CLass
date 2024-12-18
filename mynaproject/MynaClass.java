package mynaproject;
import java.util.Scanner;
public class MynaClass {
    String name;
    int Age = 0;
    int FoodInside;
    int Weight;
    Scanner scanner = new Scanner(System.in);
    
    void MynaSpeak(){
        System.out.print("Speak : ");
        String Speak = scanner.nextLine();
        if(Speak.isEmpty()){
            System.out.println(name+" Age : "+Age+" Years.");}
        else{
            System.out.println(Speak);}
    }
    void MynaEat(){
        while(true){
            System.out.println("Bird Weight : "+Weight+" gram.");
            System.out.print("Feed the Bird(gram) : ");
            int Feeding = scanner.nextInt();
            FoodInside = FoodInside + Feeding;
            if(FoodInside > Weight){
                FoodInside = 0;
                System.out.println("Bird Got Diarea,Foodinside is now "+FoodInside+" gram.");
            }
            else{
                System.out.println("Current Weight : "+(Weight+FoodInside)+" gram.");
                break;
            }
        }
    }
    void MynaExcretion(){
        System.out.print("Excrete(gram) : ");
        int Excrete = scanner.nextInt();
        FoodInside = FoodInside - Excrete;
        if(FoodInside < 0)
                System.out.println("TOO MUCH!!!");
        else{
            System.out.println("Current Weight of food inside the stomach : "+FoodInside+" gram.");
            System.out.println("Current Weight : "+(Weight+FoodInside)+" gram.");
            }        
    }
}