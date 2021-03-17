package com.social.covidindiatracker.ui

import android.content.Context
import android.os.Handler
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.social.covidindiatracker.R
import kotlinx.android.synthetic.main.item_child_rview.view.*
import java.lang.reflect.Field

open class ChildRviewAdapter(var field: Field, var mainActivity: Context) : RecyclerView.Adapter<ChildRviewAdapter.ChildRViewViewHolder>() {

    inner class ChildRViewViewHolder(var itemView: View): RecyclerView.ViewHolder(itemView)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ChildRViewViewHolder {
      return  ChildRViewViewHolder(
          LayoutInflater.from(parent.context).inflate(
              R.layout.item_child_rview,
              parent,
              false
          )
      )
    }


    override fun onBindViewHolder(holder: ChildRViewViewHolder, position: Int) {
//        field.type.declaredFields[0].type.declaredFields[0].type.simpleName
        val handler = Handler()
        handler.postDelayed(Runnable { // Do something after 5s = 5000ms
          //  holder.itemView.tv_district.text = "sahil"
            field.type.declaredFields[0].type.declaredFields[0].type.declaredFields[0].type.declaredFields[0].isAccessible =
                true
            field.type.declaredFields[0].type.declaredFields[0].type.declaredFields[0].type.declaredFields[5].isAccessible =
                true
            field.type.declaredFields[0].type.declaredFields[0].type.declaredFields[0].type.declaredFields[2].isAccessible =
                true
            field.type.declaredFields[0].type.declaredFields[0].type.declaredFields[0].type.declaredFields[1].isAccessible =
                true
            var active =
                field.type.declaredFields[0].type.declaredFields[0].type.declaredFields[0].type.declaredFields[0].get(
                    Int
                ).toString()
            var confirmed =
                field.type.declaredFields[0].type.declaredFields[0].type.declaredFields[0].type.declaredFields[1].get(
                    Int
                ).toString()
            var deceased =
                field.type.declaredFields[0].type.declaredFields[0].type.declaredFields[0].type.declaredFields[2].get(
                    Int
                ).toString()        }, 2000)

        //  var recovered =  field.type.declaredFields[0].type.declaredFields[0].type.declaredFields[0].type.declaredFields[5].get(Int).toString()
//        holder.itemView.tv_info_active.text = active
//        holder.itemView.tv_info_confirmed.text = confirmed
//        holder.itemView.tv_info_decesed.text = deceased
        //   holder.itemView.tv_info_recovered.text = recovered    }
    }
    override fun getItemCount(): Int {
        field?.isAccessible = true
        return field?.type?.declaredFields?.get(0)?.type?.declaredFields?.size?: 0
    }


}
