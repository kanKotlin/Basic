package com.voilet.basic.learn.`object`

sealed class Coupon {

    class User {

    }

    sealed class CouponStatus {
        data class StatusNotFetched(val coupon: Coupon) : CouponStatus()
        data class StatusFeteched(val coupon: Coupon, val user: User) : CouponStatus()
    }

    fun showStatus(status: CouponStatus) = when(status){
        is CouponStatus.StatusFeteched -> showFetched()
        is CouponStatus.StatusNotFetched -> showNotFeteched()
    }

    abstract fun showNotFeteched(): Any

    abstract fun showFetched(): Any
}