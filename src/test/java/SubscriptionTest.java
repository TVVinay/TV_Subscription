import org.testng.annotations.Test;

import java.time.LocalDate;

public class SubscriptionTest {

    @Test
    public void getMultipleSubscriptionBillForCurrentMonth(){
        Customer customer = new Customer("Vinay");

        MonthlySubscription monthlySubscription = new MonthlySubscription();
        NewsPaper TOI = new NewsPaper(Products.Newspaper.TOI, 3, 5, 6);
        monthlySubscription.addItem(TOI);

        WeeklySubscription weeklySubscription = new WeeklySubscription();
        NewsPaper ET = new NewsPaper(Products.Newspaper.ET, 1.5, 1.5, 1.5);
        weeklySubscription.addItem(ET);

        BiWeeklySubscription biWeeklySubscription = new BiWeeklySubscription();
        NewsPaper BM = new NewsPaper(Products.Newspaper.BM, 2.5, 3, 4);
        biWeeklySubscription.addItem(BM);

        customer.addSubscription(monthlySubscription);
        customer.addSubscription(weeklySubscription);
        customer.addSubscription(biWeeklySubscription);

        SubscriptionManager subscriptionManager = new SubscriptionManager();
        double totalExpense = subscriptionManager.getOverallSubscriptionPrice(monthlySubscription, weeklySubscription, biWeeklySubscription);


        System.out.println("Bill for "+customer.getName()+" for "+LocalDate.now().getMonth()+" is " +totalExpense);

    }

}
