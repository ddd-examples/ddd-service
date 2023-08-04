package com.starkmotors.domain.customer;

import com.starkmotors.domain.Entity;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

public class Customer implements Entity<Customer> {
    private CustomerID id;
    private String firstName;
    private String lastName;
    private String email;

    @Override
    public boolean hasSameIdentityAs(Customer that) {
        return this.id.equals(that.id);
    }
}
