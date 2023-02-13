/* Write a program that first prompts the user to enter a list of 

city names, one at a time until 

the user specifies "END". Next, 

the program should prompt the user to enter 

the average daily temperature

for each of the next five days for each city. The program should store the user's cities and temperature 

data in one data structure. Next, calculate the five-day average for each city.

Finally, display a message containing the city's name and the average for each city.

The code to prompt the user for input, to calculate the five-day average, and to display the 

results should be in separate methods.

Hint: You can use String.split(" ") to split a string into an array of strings based on where spaces 
occur in the original string.

 */
/* Mya Moxley */
/* Java Ex_4 */

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class App {
    static Scanner input =new Scanner(System.in);
    
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        ArrayList<String> cities = new ArrayList<>();

        ArrayList<Double> temps = new ArrayList<>();

        Map<ArrayList<String>, ArrayList<Double>> myMap = new HashMap<>();
        myMap.put(cities, temps);

        askCities(cities);
        askTemp(cities, temps);

        //System.out.println(cities);
        //System.out.println(temps);

        System.out.println(myMap);
        


    }



 

static ArrayList<String> askCities(ArrayList<String> b) {

    String a ="";

    while (!(a.equals("END"))){
        
        System.out.println("Please enter a list of cities");
        System.out.println("Type end to exit");
        a = input.nextLine();

        if (!(a.equals("END"))) {
            b.add(a);

        }

    }
    return b;
}



static ArrayList<Double> askTemp(ArrayList<String> cities, ArrayList<Double> temps){

   /*  double t;
    double x;
    double p;
    double z;
    double e;*/
    
   int count = cities.size();

   double total=0;



   double temp;
    
    for (int i= 0; i<cities.size();i++){
        for (int j =0;j<5;j++){
            System.out.println("Please enter temps for " + cities.get(i));
            temp = input.nextInt();
            total += temp;

        }
        double avg = total/5;

        temps.add(avg);
        total=0;
    }
    
    
        
    

    return temps;







/* 
        if (cities.size() == 5){
            System.out.printf("What's the average daily Temp for "+ k);
            t=input.nextDouble();
            temps.add(t);


        }*/



    


}
}

