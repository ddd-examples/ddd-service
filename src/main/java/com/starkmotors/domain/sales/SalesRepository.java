package com.starkmotors.domain.sales;

import java.util.List;

public interface SalesRepository {
    List<SaleTransaction> getSalesTransactions(SalesExecutiveId salesExecutiveId, Integer month);
}
