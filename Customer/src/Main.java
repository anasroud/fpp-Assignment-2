public class Main {
    public static void main(String[] args) {
        Customer johnDoe = new Customer("John", "Doe", "123-45-6789");
        Address johnDoeShippingAddress = new Address("123 Main St", "Los Angeles", "CA", "90012");
        Address johnDoeBillingAddress = new Address("123 Main St", "Los Angeles", "CA", "90012");
        johnDoe.setShippingAddress(johnDoeShippingAddress);
        johnDoe.setBillingAddress(johnDoeBillingAddress);

        Customer khaledRoud = new Customer("Khaled", "Roud", "987-65-4321");
        Address khaledRoudShippingAddress = new Address("321 Main St", "Chicago", "IL", "60616");
        Address khaledRoudBillingAddress = new Address("321 Main St", "Chicago", "IL", "60616");
        khaledRoud.setShippingAddress(khaledRoudShippingAddress);
        khaledRoud.setBillingAddress(khaledRoudBillingAddress);

        Customer AhmadMohsen = new Customer("Ahmad", "Mohsen", "123-45-6789");
        Address AhmadMohsenShippingAddress = new Address("Winter Street", "Boston", "MA", "02108");
        Address AhmadMohsenBillingAddress = new Address("Winter Street", "Boston", "MA", "02108");
        AhmadMohsen.setShippingAddress(AhmadMohsenShippingAddress);
        AhmadMohsen.setBillingAddress(AhmadMohsenBillingAddress);

        Customer[] customerBillingAddresses = {johnDoe, khaledRoud, AhmadMohsen};

        for (Customer customer : customerBillingAddresses) {
            if (customer.getBillingAddress().getCity().equals("Chicago")) {
                System.out.println("Found Customer billing address in chicago: " + customer);
            }
        }
    }
}