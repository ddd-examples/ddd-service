package com.starkmotors.application;

import com.starkmotors.domain.sales.CalculateBonusService;
import com.starkmotors.domain.sales.SalesExecutiveId;
import com.starkmotors.domain.sales.SalesRepository;

public class CarSalesApplication {
    public static void main(String[] args) {
        //run spring application
        SalesRepository salesRepository = null;//get JPA implementation of SalesRepository
        CalculateBonusService service = new CalculateBonusService(salesRepository);

        //get request for calculating bonus
        SalesExecutiveId salesExecutiveId = null;
        Double bonus = service.execute(salesExecutiveId, 7);
        //send bonus in response
    }
}
