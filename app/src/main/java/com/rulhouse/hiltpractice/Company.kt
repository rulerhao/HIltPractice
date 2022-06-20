package com.rulhouse.hiltpractice

import javax.inject.Inject

class IocCompany {
    @Inject
    lateinit var truck: Truck

    init {
        truck.deliver()
    }
}

class WithoutIocCompany {
    private val truck: Truck = Truck(driver = Driver())

    init {
        truck.deliver()
    }
}