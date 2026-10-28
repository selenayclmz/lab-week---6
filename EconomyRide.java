

package ridefarecalculator;

public class EconomyRide extends Ride {
    private double pricePerMinute;

    public EconomyRide(String passengerName, String pickup, String destination, double distanceKm, int durationMin, double pricePerKm, double pricePerMinute) {
        super(passengerName, pickup, destination, distanceKm, durationMin, pricePerKm);
        this.pricePerMinute = pricePerMinute;
    }

    @Override
    public double calculateFare() {
        double baseFare = super.calculateFare();
        double timeCharge = getDurationMin() * pricePerMinute;
        double totalFare = baseFare + timeCharge;
        
        if (totalFare < 50.0) {
            return 50.0;
        }
        return totalFare;
    }

    @Override
    public String toString() {
        return super.toString() + " -> EconomyRide [pricePerMinute=" + pricePerMinute + "]";
    }
}
