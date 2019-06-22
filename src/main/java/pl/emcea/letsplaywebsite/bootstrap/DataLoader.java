package pl.emcea.letsplaywebsite.bootstrap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;
import pl.emcea.letsplaywebsite.models.Customer;
import pl.emcea.letsplaywebsite.models.CustomerStatus;
import pl.emcea.letsplaywebsite.repositories.CustomerRepository;

@Component
public class DataLoader implements ApplicationRunner {
    private CustomerRepository customerRepository;

    public DataLoader(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {
        customerRepository.save(new Customer(
                "Mariusz",
                "Cichy",
                "mariusz.cichy@mcpm.pl",
                "$2a$10$6YgUTaHo4KHdjycA20WSqexeM267ESo6VqBqH9Qcx5GITtcOGV9zS",
                "ROLE_ADMIN",
                CustomerStatus.REGISTERED));

        customerRepository.save(new Customer(
                "Anna",
                "Cichy",
                "anna.cichy@mcpm.pl",
                "$2a$10$6YgUTaHo4KHdjycA20WSqexeM267ESo6VqBqH9Qcx5GITtcOGV9zS",
                "ROLE_USER",
                CustomerStatus.REGISTERED));

    }
}
