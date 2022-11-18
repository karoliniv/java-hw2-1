public class BonusMilesService {
    public int calculate(int cost) {
        int miles = 0;
        int rublesForOneMile = 20;

        miles = cost / rublesForOneMile;

        return miles;
    }
}
