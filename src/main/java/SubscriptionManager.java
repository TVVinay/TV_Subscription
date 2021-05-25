import java.util.ArrayList;
import java.util.List;

public class SubscriptionManager {

    private List<ISubscription> iSubscriptions;

    public SubscriptionManager()
    {
        iSubscriptions = new ArrayList<>();
    }

    public void addItem(ISubscription iItems1)
    {
        this.iSubscriptions.add(iItems1);
    }

    public double getTotalWeekdayPrice()
    {
        double totalWeekdayPrice = 0;
       for(int i = 0; i< iSubscriptions.size(); i++){
           totalWeekdayPrice=+iSubscriptions.get(i).getWeekdaysPrice();
       }
        return totalWeekdayPrice;
    }

    public double getSaturdayPrice()
    {
        double totalSaturdayPrice = 0;
        for(int i = 0; i< iSubscriptions.size(); i++){
            totalSaturdayPrice=+iSubscriptions.get(i).getSaturdayPrice();
        }
        return totalSaturdayPrice;
    }

    public double getSundayPrice()
    {
        double totalSundayPrice = 0;
        for(int i = 0; i< iSubscriptions.size(); i++){
            totalSundayPrice=+iSubscriptions.get(i).getSundayPrice();
        }
        return totalSundayPrice;
    }

    public double getOverallSubscriptionPrice(MonthlySubscription monthlySubscription, WeeklySubscription weeklySubscription, BiWeeklySubscription biweeklySubscription)
    {
        double monthlySubscriptionPrice = monthlySubscription.getSubscriptionPrice();
        double weeklySubscriptionPrice = weeklySubscription.getSubscriptionPrice();
        double biweeklySubscriptionPrice = biweeklySubscription.getSubscriptionPrice();

        double OverallSubscriptionPrice = monthlySubscriptionPrice + weeklySubscriptionPrice + biweeklySubscriptionPrice;
        return OverallSubscriptionPrice;
    }

}
