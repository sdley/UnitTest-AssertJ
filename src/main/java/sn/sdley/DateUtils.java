package sn.sdley;

import java.time.LocalDate;

public class DateUtils {
    public static LocalDate getToday() {
        return LocalDate.now();
    }

    // methode main
    public static void main(String[] args) {
        System.out.println("Date du jour : " + getToday()); // 2025-02-19
    }
}
