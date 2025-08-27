package data;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.Random;

@Getter
@AllArgsConstructor
public enum Constants {

    URL("https://www.demoblaze.com/"),
    LOGIN_MESSAGE("Welcome Maria1942"),
    RANDOM_USERNAME(generateRandomUsername()),
    USERNAME("Maria1942"),
    WRONG_USERNAME("Maria12346"),
    PASSWORD("Pass1234"),
    WRONG_PASSWORD("123546"),
    PURCHASE_MESSAGE("Thank you for your purchase!"),
    NAME("Raluca"),
    COUNTRY("Romania"),
    CITY("Bucharest"),
    CARD("123654786"),
    MONTH("June"),
    YEAR("2025");

    private final String value;
    private static Random rnd = null;

    private static String generateRandomUsername() {
        rnd = new Random();
        int number = rnd.nextInt(10000);
        return "Maria" + number;
    }
}
