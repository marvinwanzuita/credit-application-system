package com.mrvw.creditapplicationsystem.dto

import com.mrvw.creditapplicationsystem.entity.Credit
import java.math.BigDecimal
import java.util.UUID

data class CreditViewList(
    var creditCode: UUID,
    var creditValue: BigDecimal,
    var numberOfInstallments: Int
) {

    constructor(credit: Credit): this (
        creditCode = credit.creditCode,
        creditValue = credit.creditValue,
        numberOfInstallments = credit.numberOfInstallments

    )

}
