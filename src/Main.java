
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BonusMilesService service = new BonusMilesService();
        System.out.println("Введите стоимость билета ");
        int price = scanner.nextInt();
        int miles = service.calculate(price);
        System.out.println("За покупку билета Вам будет начисленно баллов в кол-ве:" + miles);
    }
}


