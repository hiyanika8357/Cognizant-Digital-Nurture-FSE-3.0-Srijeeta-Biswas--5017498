public class DependencyInjectionExample {
    public static void main(String[] args) {
        // Create a CustomerRepositoryImpl object
        CustomerRepository customerRepository = new CustomerRepositoryImpl();
        // Inject CustomerRepository into CustomerService using constructor injection
        CustomerService customerService = new CustomerService(customerRepository);
        // Find a customer by ID
        Customer customer = customerService.getCustomerById("12345");
        // Display customer details
        System.out.println("Customer ID: " + customer.getId());
        System.out.println("Customer Name: " + customer.getName());
    }
}