package com.everis.becakotlinmvvm.viewModel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.everis.becakotlinmvvm.api.HolidayRepository
import com.everis.becakotlinmvvm.model.HolidayModel

class HolidayViewModel: ViewModel() {
    
    var holidayRepository: HolidayRepository? = null
    var mutableLiveData: MutableLiveData<List<HolidayModel>>? = null

    init {
        holidayRepository = HolidayRepository()
    }

    fun getHolidays(): LiveData<List<HolidayModel>> {
        if (mutableLiveData == null) {
            mutableLiveData = holidayRepository!!.fetchHolidays()
        }

        return mutableLiveData!!
    }

}