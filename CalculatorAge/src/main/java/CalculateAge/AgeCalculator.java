package CalculateAge;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class AgeCalculator {
    public int calculateAgeInDays(String birthdate) {
        try {
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
            Date dateOfBirth = dateFormat.parse(birthdate);
            Date currentDate = new Date();

            long differenceInMilliseconds = currentDate.getTime() - dateOfBirth.getTime();
            long differenceInDays = TimeUnit.DAYS.convert(differenceInMilliseconds, TimeUnit.MILLISECONDS);

            return (int) differenceInDays;
        } catch (ParseException e) {
            e.printStackTrace();
            return -1; // Return -1 in case of a parsing error.
        }
    }
}
