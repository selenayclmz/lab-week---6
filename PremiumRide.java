

package ridefarecalculator;

public class PremiumRide extends Ride {
    private double comfortFee;
    private double surgeMultiplier;

    public PremiumRide(String passengerName, String pickup, String destination, double distanceKm, int durationMin, double pricePerKm, double comfortFee, double surgeMultiplier) {
        super(passengerName, pickup, destination, distanceKm, durationMin, pricePerKm);
        this.comfortFee = comfortFee;
        
        if (surgeMultiplier >= 1.0 && surgeMultiplier <= 3.0) {
            this.surgeMultiplier = surgeMultiplier;
        } else {
            System.out.println("Warning: surgeMultiplier must be between 1.0 and 3.0. Set to 1.0.");
            this.surgeMultiplier = 1.0;
        }
    }

    @Override
    public double calculateFare() {
        return (super.calculateFare() + comfortFee) * surgeMultiplier;
    }

    @Override
    public String toString() {
        return super.toString() + " -> PremiumRide [comfortFee=" + comfortFee + ", surgeMultiplier=" + surgeMultiplier + "]";
    }
}
