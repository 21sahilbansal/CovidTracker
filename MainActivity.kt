package com.social.covidindiatracker.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.social.covidindiatracker.R
import com.social.covidindiatracker.network.dataClasses.CovidResponse
import kotlinx.android.synthetic.main.activity_main.*
import java.lang.reflect.Field
import kotlin.collections.ArrayList

class MainActivity : AppCompatActivity() {
    lateinit var mainViewModel: MainViewModel
    var responseList = ArrayList<Field>()
    var reslist = ArrayList<Any>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        mainViewModel = ViewModelProvider(this,
            ViewModelProvider.AndroidViewModelFactory(application)).get(MainViewModel ::class.java)
        mainViewModel.covidResponseData.observe(this,  {
            it?.let {

                prepareData(it)
                setDataToUi(it)
            }
        })
        mainViewModel.getCovidResponseFromApi()
    }

    private fun prepareData(covidResponse: CovidResponse) {

//        var fr = covidResponse.andamanAndNicobarIslands.javaClass.declaredFields
//        fr[0].isAccessible = true
//        fr[0].get(covidResponse.andamanAndNicobarIslands)
        for (field in covidResponse.javaClass.declaredFields){
            responseList.add(field)
        }
    }

    private fun setDataToUi(covidResponse: CovidResponse) {
        parent_rview.layoutManager = LinearLayoutManager(this)
          parent_rview.adapter = ParentRViewAdapter(responseList,covidResponse,this)
    }
}

//responseList[0].isAccessible = true
//responseList[0].get(covidResponse)