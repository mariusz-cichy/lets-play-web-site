package pl.emcea.letsplaywebsite.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;
import pl.emcea.letsplaywebsite.models.Customer;
import pl.emcea.letsplaywebsite.repositories.CustomerRepository;

import java.util.Arrays;
import java.util.List;

@Component
public class CustomerDetailServiceImpl implements UserDetailsService {

    @Autowired
    CustomerRepository customerRepository;

    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
        Customer customer = customerRepository.findCustomerByEmail(email);
        if (customer == null) {
            throw new UsernameNotFoundException("Niewłaściwy login albo hasło");
        }
        return new User(customer.getEmail(), customer.getPassword(),
                Arrays.asList(new SimpleGrantedAuthority(customer.getRole()))
        );
    }
}
