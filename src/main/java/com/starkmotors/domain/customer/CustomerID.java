package com.starkmotors.domain.customer;

import lombok.EqualsAndHashCode;
import lombok.Getter;

import java.util.UUID;


@EqualsAndHashCode
@Getter
public class CustomerID {
    private UUID uuid;

    public CustomerID(UUID uuid) {
        this.uuid = uuid;
    }
}
