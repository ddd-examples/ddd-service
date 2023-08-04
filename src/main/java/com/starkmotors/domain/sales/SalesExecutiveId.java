package com.starkmotors.domain.sales;

import java.util.Objects;
import java.util.UUID;

public class SalesExecutiveId {
    private final UUID uuid;

    public SalesExecutiveId(UUID uuid) {
        this.uuid = uuid;
    }

    public UUID getUuid() {
        return uuid;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SalesExecutiveId that = (SalesExecutiveId) o;
        return Objects.equals(uuid, that.uuid);
    }

    @Override
    public int hashCode() {
        return Objects.hash(uuid);
    }
}
