package com.example.myapplication.Repository

import com.example.myapplication.Domain.BudgetDomain
import com.example.myapplication.Domain.ExpenseDomain

class MainRepository {
    val items= mutableListOf(
            ExpenseDomain("Restaurant",1250.00,"img1","17 Jun 2024 20:12"),
            ExpenseDomain("Jollibee",780.00,"img2","16 Jun 2024 12:56"),
            ExpenseDomain("Vista Cinema",900.00,"img3","16 Jun 2024 5:34"),
            ExpenseDomain("Jollibee",342.50,"img2","15 Jun 2024 9:45"),

        )

    val budget= mutableListOf(
        BudgetDomain("Home Loan",10000.0,70.0),
        BudgetDomain("Car Loan",2500.0,20.0),
        BudgetDomain("Internet Subscription",1500.0,10.0),
    )


}