public class Customer {
    private final String firstName; // final because it should not be changed
    private final String lastName; // final because it should not be changed
    private final String socSecurityNum; // final because it should not be changed
    private Address billingAddress;
    private Address shippingAddress;

    Customer (String firstName, String lastName, String socSecurityNum) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.socSecurityNum = socSecurityNum;
    }

    public void setShippingAddress(Address shippingAddress) {
        this.shippingAddress = shippingAddress;
    }

    public void setBillingAddress(Address billingAddress) {
        this.billingAddress = billingAddress;
    }

    public Address getShippingAddress() {
        return shippingAddress;
    }

    public Address getBillingAddress() {
        return billingAddress;
    }

    public void printCustomer() {
        System.out.println("First Name: " + firstName);
        System.out.println("Last Name: " + lastName);
        System.out.println("Social Security Number: " + socSecurityNum);
        System.out.println("Shipping Address: ");
        shippingAddress.printAddress();
        System.out.println("Billing Address: ");
        billingAddress.printAddress();
    }


    public String toString() {
        return "[" + firstName + ", " + lastName + ", " + "ssn: " + socSecurityNum + "]";
    }
}
