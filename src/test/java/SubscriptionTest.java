import org.testng.annotations.Test;

import java.time.LocalDate;

public class SubscriptionTest {

    @Test
    public void getTotalSubscriptionAmountForCurrentMonth(){
        Customer customer = new Customer("Vinay");

        MonthlySubscription monthlySubscription = new MonthlySubscription();
        ProductManager TOI = new ProductManager(Products.Newspaper.TOI, 5, 5, 6);
        monthlySubscription.addItem(TOI);

        WeeklySubscription weeklySubscription = new WeeklySubscription();
        ProductManager ET = new ProductManager(Products.Newspaper.ET, 1.5, 1.5, 1.5);
        weeklySubscription.addItem(ET);

        BiWeeklySubscription biWeeklySubscription = new BiWeeklySubscription();
        ProductManager BM = new ProductManager(Products.Newspaper.BM, 2.5, 3, 4);
        biWeeklySubscription.addItem(BM);

        customer.addSubscription(monthlySubscription);
        customer.addSubscription(weeklySubscription);
        customer.addSubscription(biWeeklySubscription);

        SubscriptionManager subscriptionManager = new SubscriptionManager();
        double totalExpense = subscriptionManager.getTotalSubscriptionPriceforCurrentMonth(monthlySubscription, weeklySubscription, biWeeklySubscription);


        System.out.println("Bill for "+customer.getName()+" for "+LocalDate.now().getMonth()+" is " +totalExpense);

    }

}
