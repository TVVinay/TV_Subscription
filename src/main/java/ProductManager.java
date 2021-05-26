public class ProductManager implements ISubscription {

    private Products.Newspaper name;
    private double weekDayAmount;
    private double saturdayAmount;
    private double sundayAmount;

    public ProductManager(Products.Newspaper name, double weekDayAmount, double saturdayAmount, double sundayAmount) {
        this.name = name;
        this.weekDayAmount = weekDayAmount;
        this.saturdayAmount = saturdayAmount;
        this.sundayAmount = sundayAmount;
    }

    public Products.Newspaper getName() {
        return name;
    }

    @Override
    public double getWeekdaysPrice() {
        return weekDayAmount;
    }

    @Override
    public double getSaturdayPrice() {
        return saturdayAmount;
    }

    @Override
    public double getSundayPrice() {
        return sundayAmount;
    }
}

