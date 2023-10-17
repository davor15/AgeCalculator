package CalculateAge;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class AgeCalculator {
    public static int calculateAgeInDays(String birthdate) {
        // Kreiranje formatera za unos datuma u formatu "yyyy-MM-dd"
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");

        // Parsiranje datuma rođenja
        LocalDate birthDate = LocalDate.parse(birthdate, formatter);

        // Dobijanje trenutnog datuma
        LocalDate currentDate = LocalDate.now();

        // Izračunavanje razlike između datuma rođenja i trenutnog datuma
        Period period = Period.between(birthDate, currentDate);

        // Dobijanje broja dana iz Period objekta
        return period.getDays();
    }
}