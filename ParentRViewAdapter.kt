package com.social.covidindiatracker.ui

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.social.covidindiatracker.R
import com.social.covidindiatracker.network.dataClasses.CovidResponse
import kotlinx.android.synthetic.main.item_parent_rview.view.*
import java.lang.reflect.Field

class ParentRViewAdapter(
    var responseList: ArrayList<Field>,
    var covidResponse: CovidResponse,
   var mainActivity: MainActivity
) : RecyclerView.Adapter<ParentRViewAdapter.ParentRViewViewHolder>() {


   inner class ParentRViewViewHolder( itemView : View): RecyclerView.ViewHolder(itemView){
             lateinit var childAdapter : ChildRviewAdapter
              fun setChildAdapter(field: Field, context: Context) {
                  this.childAdapter = ChildRviewAdapter(responseList[position],
                      context
                  )}
           fun getMyChildAdapter(): ChildRviewAdapter {
           return this.childAdapter
       }

   }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ParentRViewViewHolder {
        return ParentRViewViewHolder(LayoutInflater.from(mainActivity.applicationContext).inflate(R.layout.item_parent_rview,parent,false))
    }

    override fun onBindViewHolder(  holder: ParentRViewViewHolder, position: Int) {
       // (responseList[0] as Field).type.declaredFields[0].type.simpleName
        holder.itemView.tv_state_name.text = responseList[position].type.simpleName
        holder.itemView.rv_child_1.layoutManager = LinearLayoutManager(holder.itemView.context)
            responseList[position].isAccessible = true
        holder.setChildAdapter(responseList[position],holder.itemView.context)
                holder.itemView.rv_child_1.adapter = holder.getMyChildAdapter()
    }

    override fun getItemCount(): Int {
        return  responseList.size
    }
}