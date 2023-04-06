package com.mrvw.creditapplicationsystem.dto

import com.mrvw.creditapplicationsystem.ennumeration.Status
import com.mrvw.creditapplicationsystem.entity.Credit
import java.math.BigDecimal
import java.util.UUID

data class CreditView (

    var creditCode: UUID,
    var creditValue: BigDecimal,
    var numberOfInstallment: Int,
    var status: Status,
    var emailCustomer: String?,
    var incomeCustomer: BigDecimal?

){

    constructor(credit: Credit): this(
        creditCode = credit.creditCode,
        creditValue = credit.creditValue,
        numberOfInstallment = credit.numberOfInstallments,
        status = credit.status,
        emailCustomer = credit.customer?.email,
        incomeCustomer = credit.customer?.income
    )


}