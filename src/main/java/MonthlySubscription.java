public class MonthlySubscription extends SubscriptionManager {

    Calender calender = new Calender();
    public double getSubscriptionPrice() {

        double saturdayAmount = getSaturdayPrice() * calender.getTotalNumberOfSaturdaysInCurrentMonth();
        double sundayAmount = getSundayPrice() * calender.getTotalNumberOfSundaysInCurrentMonth();
        double weekdayAmount = getTotalWeekdayPrice() * calender.getTotalNumberOfWeekDays();

        return saturdayAmount + sundayAmount + weekdayAmount;

    }
}
