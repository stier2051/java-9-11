package mun.cookbook.stream;

public class Customer implements Comparable<Customer>{
    int customerId;
    String customerName;
    double customerBalance;

    @Override
    public int compareTo(Customer o) {
        return customerName.compareTo(o.customerName);
    }

    public Customer() {
    }

    public Customer(int customerId, String customerName, double customerBalance) {
        this.customerId = customerId;
        this.customerName = customerName;
        this.customerBalance = customerBalance;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public double getCustomerBalance() {
        return customerBalance;
    }

    public void setCustomerBalance(double customerBalance) {
        this.customerBalance = customerBalance;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "customerId=" + customerId +
                ", customerName='" + customerName + '\'' +
                ", customerBalance=" + customerBalance +
                '}';
    }
}
