package com.mrvw.creditapplicationsystem.dto

import com.mrvw.creditapplicationsystem.entity.Credit
import com.mrvw.creditapplicationsystem.entity.Customer
import jakarta.validation.constraints.Future
import jakarta.validation.constraints.NotNull
import jakarta.validation.constraints.PositiveOrZero
import java.math.BigDecimal
import java.time.LocalDate

data class CreditDto(

    @field:NotNull(message = "Invalid input")
    val creditValue: BigDecimal,

    @field:Future(message = "Only future date")
    val dayFirstOfInstallment: LocalDate,

    @field:PositiveOrZero(message = "Only positive input")
    val numberOfInstallments: Int,

    @field:NotNull(message = "Invalid input")
    val customerId: Long
) {

    fun toEntity(): Credit = Credit(
        creditValue = this.creditValue,
        dayFirstInstallment = this.dayFirstOfInstallment,
        numberOfInstallments = this.numberOfInstallments,
        customer = Customer(id = this.customerId)
    )

}
