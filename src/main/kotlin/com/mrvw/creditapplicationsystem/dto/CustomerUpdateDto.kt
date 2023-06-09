package com.mrvw.creditapplicationsystem.dto

import com.mrvw.creditapplicationsystem.entity.Customer
import jakarta.validation.constraints.NotEmpty
import jakarta.validation.constraints.NotNull
import java.math.BigDecimal

data class CustomerUpdateDto(

    @field:NotEmpty(message = "Invalid input")
    var firstName: String,

    @field:NotEmpty(message = "Invalid input")
    var lastName: String,

    @field:NotNull(message = "Invalid input.")
    var income: BigDecimal,

    @field:NotEmpty(message = "Invalid input")
    var zipCode: String,

    @field:NotEmpty(message = "Invalid input")
    var street: String
) {

    fun toEntity(customer: Customer) : Customer {
        customer.firstName = this.firstName
        customer.lastName = this.lastName
        customer.income = this.income
        customer.address.street = this.street
        customer.address.zipCode = this.zipCode
        return customer
    }
}
