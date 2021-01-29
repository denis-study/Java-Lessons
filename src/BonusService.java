public class BonusService {
    public long calculate (long amount, boolean registered) {

        int percent = registered ? 3 : 1;//сокращение if - else
        long bonus = amount * percent / 100 / 100;
        int limit = 500;
        if (bonus > limit) {
            bonus = limit;
        }
              return bonus;
    }
}
