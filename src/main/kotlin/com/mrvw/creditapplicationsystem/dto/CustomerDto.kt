package com.mrvw.creditapplicationsystem.dto

import com.mrvw.creditapplicationsystem.entity.Address
import com.mrvw.creditapplicationsystem.entity.Customer
import jakarta.validation.constraints.Email
import jakarta.validation.constraints.NotEmpty
import jakarta.validation.constraints.NotNull
import org.hibernate.validator.constraints.br.CPF
import java.math.BigDecimal

data class CustomerDto(

    @field:NotEmpty(message = "Invalid input")
    var firstName: String,

    @field:NotEmpty(message = "Invalid input")
    var lastName: String,

    @field:NotEmpty(message = "Invalid input")
    @field:CPF(message = "This invalid CPF")
    var cpf: String,

    @field:NotNull(message = "Invalid input")
    var income: BigDecimal,

    @field:NotEmpty(message = "Invalid input")
    @field:Email(message = "Invalid email")
    var email : String,

    @field:NotEmpty(message = "Invalid input")
    var password: String,

    @field:NotEmpty(message = "Invalid input")
    var zipCode: String,

    @field:NotEmpty(message = "Invalid input")
    var street: String
) {

    fun toEntity(): Customer = Customer(
        firstName = this.firstName,
        lastName = this.lastName,
        cpf = this.cpf,
        income = this.income,
        email = this.email,
        password = this.password,
        address = Address(
            zipCode = this.zipCode,
            street = this.street
        )
    )

}