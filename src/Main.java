/*public class Main {

    public static void main(String[] args) {
        boolean registered = true;
        float amount = 1000.60F;
        float percent = 0.03F;

        float bonus = amount * percent;
        System.out.println(bonus);
    }
}*/
/*public class Main {

    public static void main(String[] args) {
        boolean registered = true;
        int amount = 1000_60;
        int percent = 3;

        int bonus = amount / 100 * percent / 100;
        System.out.println(bonus);
    }
}*/


/*public class Main {

    public static void main(String[] args) {
        boolean registered = false;
        int percent;

        if (registered) {
             percent = 3;
        }else {
             percent = 1;
        }

        int amount = 1000_60;

        int bonus = amount * percent / 100 / 100;
        System.out.println(bonus);
    }
}*/


/*public class Main {

    public static void main(String[] args) {
        boolean registered = true;
        int percent;

        if (registered) {
            percent = 3;
        } else {
            percent = 1;
        }

        int amount = 25_000_60;

        int bonus = amount * percent / 100 / 100;
        int limit = 500;

        if (bonus > limit) {
            bonus = limit;
        }
        System.out.println(bonus);
    }
}*/

/*public class Main {

    public static void main(String[] args) {
        boolean registered = true;
        int percent = registered ? 3 : 1;//сокращение if - else
        long amount = 100060;
        long bonus = amount * percent / 100 / 100;
        int limit = 500;

        if (bonus > limit) {
            bonus = limit;
        }
        System.out.println(bonus);
    }
}*/

/*public class Main {

    public static void main(String[] args) {
        boolean registered = true;
        int percent = registered ? 3 : 1;//сокращение if - else
        long amount = 100060;
        long bonus = amount * percent / 100 / 100;
        int limit = 500;

        if (bonus > limit) {
            bonus = limit;
        }
        System.out.println(bonus);

    }
}*/

public class Main {
    public static void main(String[] args) {
        BonusService service = new BonusService();
        long bonus = service.calculate(1000_60, true);
        System.out.println(bonus);
    }
}



























