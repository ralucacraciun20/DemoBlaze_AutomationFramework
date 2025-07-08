package data;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum Constants {

    URL("https://www.demoblaze.com/"),
    LOGIN_MESSAGE("Welcome Maria1942"),
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
}
