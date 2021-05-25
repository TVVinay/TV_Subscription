public class BiWeeklySubscription extends SubscriptionManager {


    Calender calender = new Calender();
    SubscriptionManager subscriptionManager = new SubscriptionManager();

    public double getSubscriptionPrice() {
      int totalBiWeeklyInCurrentMonth = calender.getTotalBiWeeklyDays();
        return subscriptionManager.getSaturdayPrice() * totalBiWeeklyInCurrentMonth;



    }

}
