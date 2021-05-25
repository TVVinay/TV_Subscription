public class WeeklySubscription extends SubscriptionManager {

    Calender calender = new Calender();

    public double getSubscriptionPrice() {
       double saturdayAmount = getSaturdayPrice() * calender.getTotalNumberOfSaturdaysInCurrentMonth();
       double sundayAmount = getSundayPrice() * calender.getTotalNumberOfSundaysInCurrentMonth();

       return saturdayAmount + sundayAmount;
    }
}
