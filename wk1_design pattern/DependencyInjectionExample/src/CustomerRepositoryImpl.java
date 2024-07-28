public class CustomerRepositoryImpl implements CustomerRepository {
    @Override
    public Customer findCustomerById(String id) {
        // Mock implementation, in real scenario this would query a database
        return new Customer(id, "John Doe");
    }
}