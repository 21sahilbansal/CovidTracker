package com.social.covidindiatracker.ui

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.social.covidindiatracker.network.dataClasses.CovidResponse
import com.social.covidindiatracker.utils.RetrofitUtil
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.disposables.Disposable
import io.reactivex.schedulers.Schedulers

class MainViewModel : ViewModel() {
    private lateinit var disposable: Disposable

    // Mutable Variables
    var mError = MutableLiveData<Throwable>()
    var covidResponseData: MutableLiveData<CovidResponse> = MutableLiveData<CovidResponse>()
    var apiService = RetrofitUtil.createBaseApiService()


    fun getCovidResponseFromApi() {
        disposable = apiService.getStateWiseInfo()
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .subscribe(
                { onSuccessLogin(it) },
                { onError(it) }
            )
    }

    private fun onSuccessLogin(it: CovidResponse) {
        covidResponseData.value = it
    }

    private fun onError(it: Throwable) {
        mError.value = it
    }

    override fun onCleared() {
        super.onCleared()
        disposable.dispose()
    }
}