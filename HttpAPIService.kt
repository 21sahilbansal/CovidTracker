package com.social.covidindiatracker.network

import com.social.covidindiatracker.network.dataClasses.CovidResponse
import io.reactivex.Observable
import retrofit2.http.GET
import java.util.*

interface HttpAPIService {
    @GET(HttpConstants.STATE_DISTRICT_WISE)
     fun getStateWiseInfo(): Observable<CovidResponse>
}