public class Main {
    public static void main(String[] args) {
        int ticketPrice = 12499; //стоимость билета
        int rublesForOneMile = 20; //рубли за одну милю

        int miles = ticketPrice / rublesForOneMile; //мили

        System.out.println("Милей за билет: " + miles);
    }
}
