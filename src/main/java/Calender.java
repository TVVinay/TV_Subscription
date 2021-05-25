import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.YearMonth;
import java.util.Calendar;

public class Calender {

    public int getTotalDaysInCurrentMonth()
    {
        int daysLeft = 0;
        Calendar calendar = Calendar.getInstance();
        int lastDay = calendar.getActualMaximum(Calendar.DAY_OF_MONTH);
        int currentDay = calendar.get(Calendar.DAY_OF_MONTH);
        daysLeft = lastDay - currentDay;
        return daysLeft;

    }

    public int getTotalNumberOfSaturdaysInCurrentMonth()
    {
        LocalDate fromDate = LocalDate.now();
        LocalDate toDate = YearMonth.now().atEndOfMonth();
        int saturday = 0;
        while (!fromDate.isAfter(toDate)) {
            if (fromDate.getDayOfWeek().equals(DayOfWeek.SATURDAY))
                saturday++;
            fromDate = fromDate.plusDays(1);
        }

        return saturday;

    }

    public int getTotalNumberOfSundaysInCurrentMonth()
    {
        LocalDate fromDate = LocalDate.now();
        LocalDate toDate = YearMonth.now().atEndOfMonth();
        int sunday = 0;
        while (!fromDate.isAfter(toDate)) {
            if (fromDate.getDayOfWeek().equals(DayOfWeek.SUNDAY))
                sunday++;
            fromDate = fromDate.plusDays(1);
        }
        return sunday;
    }

    public int getTotalNumberOfWeekDays()
    {
        return getTotalDaysInCurrentMonth() - (getTotalNumberOfSaturdaysInCurrentMonth() + getTotalNumberOfSundaysInCurrentMonth());
    }

    public int getTotalBiWeeklyDays()
    {
        int totalDaysInAMonth = getTotalDaysInCurrentMonth();
        return totalDaysInAMonth % 14;

    }

}
