package com.starkmotors.domain.sales;

import java.util.List;

public class CalculateBonusService {
    private static final Double BONUS_FACTOR = 0.10;
    private final SalesRepository salesRepository;

    public CalculateBonusService(SalesRepository salesRepository) {
        this.salesRepository = salesRepository;
    }

    public Double execute(SalesExecutiveId salesExecutiveId, Integer month) {
        List<SaleTransaction> transactions = salesRepository.getSalesTransactions(salesExecutiveId, month);
        return transactions.size() * BONUS_FACTOR;
    }
}
