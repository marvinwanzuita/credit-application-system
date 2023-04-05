package com.mrvw.creditapplicationsystem.service.impl

import com.mrvw.creditapplicationsystem.entity.Customer
import com.mrvw.creditapplicationsystem.exception.BusinessException
import com.mrvw.creditapplicationsystem.repository.CustomerRepository
import com.mrvw.creditapplicationsystem.service.ICustomerService
import org.springframework.stereotype.Service

@Service
class CustomerService(
    private val customerRepository: CustomerRepository
): ICustomerService {

    override fun save(customer: Customer): Customer {
        return this.customerRepository.save(customer)
    }

    override fun findById(id: Long): Customer {
        return this.customerRepository.findById(id).orElseThrow {
            throw BusinessException("Id $id not found")
        }
    }

    override fun delete(id: Long) {
        this.customerRepository.deleteById(id)
    }


}