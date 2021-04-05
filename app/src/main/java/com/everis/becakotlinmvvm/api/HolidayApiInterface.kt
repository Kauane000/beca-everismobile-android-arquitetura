package com.everis.becakotlinmvvm.api

import com.everis.becakotlinmvvm.HolidayModel
import retrofit2.Call
import retrofit2.http.GET

interface HolidayApiInterface {

    @GET("PublicHolidays/2021/br")
    fun getHolidays(): Call<List<HolidayModel>>
}