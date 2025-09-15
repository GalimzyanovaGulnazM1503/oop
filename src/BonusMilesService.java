public class BonusMilesService {
    int calculate(int ticketPrice) {
        int milePrice = 20;
        return ticketPrice / milePrice;
    }
}
