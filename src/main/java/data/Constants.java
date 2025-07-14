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
    PASSWORD("Pass1234"),
    PURCHASE_MESSAGE("Thank you for your purchase!"),
    NAME("Raluca"),
    COUNTRY("Romania"),
    CITY("Bucharest"),
    CARD("123654786"),
    MONTH("June"),
    YEAR("2025");

    private final String value;

    static final Random rnd = new Random();

    private static String generateRandomUsername() {
        int number = rnd.nextInt(10000);
        return "Maria" + number;
    }
}
