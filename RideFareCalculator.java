

package ridefarecalculator;

import java.util.ArrayList;

public class RideFareCalculator {

 
    public static void main(String[] args) {
       
        ArrayList<Ride> rides = new ArrayList<>();

        rides.add(new Ride("Ahmet", "Kadikoy", "Uskudar", 5.5, 15, 10.0));
        rides.add(new EconomyRide("Ayse", "Besiktas", "Taksim", 4.0, 20, 8.0, 1.5));
        rides.add(new EconomyRide("Mehmet", "Sisli", "Mecidiyekoy", 1.5, 5, 8.0, 1.5));
        rides.add(new PremiumRide("Can", "Bebek", "Nisantasi", 7.0, 25, 15.0, 50.0, 1.5));
        rides.add(new SharedRide("Elif", "Atasehir", "Maltepe", 10.0, 30, 8.0, 1.5, 3));
        
        rides.add(new Ride("HataTest1", "A", "B", -5, 10, 10));
        rides.add(new PremiumRide("HataTest2", "C", "D", 5, 10, 10, 20, 5.0));
        rides.add(new SharedRide("HataTest3", "E", "F", 10, 20, 8.0, 1.5, 6));

        System.out.println("--- RIDE DETAILS AND FARES ---");
        for (Ride r : rides) {
            System.out.println(r.toString());
            System.out.println("Calculated Fare: " + r.calculateFare() + " TL");
            System.out.println("--------------------------------------------------");
        
        
        
        
    }
    
}
}