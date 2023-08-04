package com.starkmotors.domain.sales;

import com.starkmotors.domain.Entity;
import com.starkmotors.domain.car.CarId;
import com.starkmotors.domain.customer.CustomerID;

import java.time.LocalDate;

public class SaleTransaction implements Entity<SaleTransaction> {
    private TransactionId id;
    private CarId carId;
    private SalesExecutiveId salesExecutiveId;
    private CustomerID customerID;
    private LocalDate date;

    @Override
    public boolean hasSameIdentityAs(SaleTransaction that) {
        return this.id.equals(that.id);
    }
}
