package com.social.covidindiatracker.utils

import com.google.gson.GsonBuilder
import com.social.covidindiatracker.network.HttpAPIService
import com.social.covidindiatracker.network.HttpConstants
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.converter.scalars.ScalarsConverterFactory
import java.util.concurrent.TimeUnit

object RetrofitUtil {

    fun createBaseApiService(
        baseUrl: String ="https://api.covid19india.org/",
        connectTimeoutInSec: Long = 60,
        readTimeoutInSec: Long = 60,
        writeTimeoutInSec: Long = 60
    ): HttpAPIService {
        return getRetrofitClient(
                getOkhttpClientBuilder(
                        connectTimeoutInSec,
                        readTimeoutInSec,
                        writeTimeoutInSec
                ), baseUrl
        ).create(HttpAPIService::class.java)
    }


    fun getRetrofitClient(okHttpClientBuilder: OkHttpClient.Builder, baseUrl: String) = Retrofit.Builder()
            .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
            .addConverterFactory(GsonConverterFactory.create(GsonBuilder().setLenient().create()))
            .addConverterFactory(ScalarsConverterFactory.create())
            .client(okHttpClientBuilder.build())
            .baseUrl(baseUrl)
            .build()

    fun getOkhttpClientBuilder(
            connectTimeoutInSec: Long,
            readTimeoutInSec: Long,
            writeTimeoutInSec: Long
    ): OkHttpClient.Builder {

        val okHttpClientBuilder = OkHttpClient.Builder()
        val loggingInterceptor = HttpLoggingInterceptor()
        loggingInterceptor.level = HttpLoggingInterceptor.Level.BODY
        okHttpClientBuilder.addInterceptor(loggingInterceptor)

                .connectTimeout(connectTimeoutInSec, TimeUnit.SECONDS)
                .readTimeout(readTimeoutInSec, TimeUnit.SECONDS)
                .writeTimeout(writeTimeoutInSec, TimeUnit.SECONDS)

        return okHttpClientBuilder
    }
}