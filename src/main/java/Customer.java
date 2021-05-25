import java.util.ArrayList;
import java.util.List;

public class Customer {

    private String name;
    private List<SubscriptionManager> subscriptions;

    public Customer(String name){
        this.name = name;
        subscriptions = new ArrayList<>();
    }

    public String getName(){
        return name;
    }

    public void addSubscription(SubscriptionManager subscription){
        subscriptions.add(subscription);
    }

}
