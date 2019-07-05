package pl.emcea.letsplaywebsite.models;

import javax.persistence.*;
import javax.validation.constraints.Email;

@Entity(name="customers")
public class Customer {
    @Id
    @Column
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer id;

    @Column
    private String firstName;
    @Column
    private String lastName;
    @Column
    @Email
    private String email;
    @Column
    private String password;
    @Column
    private String role;
    @Enumerated(EnumType.STRING)
    private CustomerStatus status;

    public Customer() {
    }

    public Customer(String firstName, String lastName, @Email String email, String password, String role, CustomerStatus status) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.password = password;
        this.role = role;
        this.status = status;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public CustomerStatus getStatus() {
        return status;
    }

    public void setStatus(CustomerStatus status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", role='" + role + '\'' +
                ", status=" + status +
                '}';
    }
}
