package com.example.recyclerveiwkt

import android.os.Parcel
import android.os.Parcelable
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.view.menu.MenuView.ItemView
import androidx.recyclerview.widget.RecyclerView

class ProfileAdapter(val profileList: ArrayList<Profiles>) :
    RecyclerView.Adapter<ProfileAdapter.CustomViewHoler>() {


    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): ProfileAdapter.CustomViewHoler {
        //뷰를 생성 후 커스텀 뷰홀더에서 다시 전달해주는 것. 커스텀 뷰홀더가 실행되면서 아이템 뷰홀더가 val view가 됨
        val view = LayoutInflater.from(parent.context).inflate(R.layout.list_item, parent, false)
        return CustomViewHoler(view).apply {

            itemView.setOnClickListener {
                val curPos: Int = adapterPosition
                val prolile: Profiles = profileList.get(CurPos)
                Toast.makeText(
                    (parent.context
                    "이름: ${profile.name} \n나이 : ${profile.age} \n 직업 :${prolile.job}",
                    Toast.LENGTH_SHORT
                ).show()
            }
        }
    }

    override fun getItemCount(): Int {
        return profileList.size
        //리스트 들에 대한 총 갯수를 계속 리턴해주게됨
    }

    override fun onBindViewHolder(holder: ProfileAdapter, CustomViewHolder, position: Int) {
        holder.gender.setImge.Resource(profileList.get(position).gender)
        holder.name.text = profileList.get(position).name
        holder.age.text = profileList.get(position).age.toString()
        //에이지는 숫자이기 때문에 toString
        holder.job.text = profileList.get(position).jab

    }
    //위 바인드 뷰홀더는 한번만 실행되고 끝나는게 아니라 계속 실행되는 곳


    class CustomViewHoler(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val gender = itemView.findViewById<ItemView>(R.id.iv_profile) //성별
        val name = itemView.findViewById<TextView>(R.id.tv_name) //이름
        val age = itemView.findViewById<TextView>(R.id.tv_age) //나이
        val job = itemView.findViewById<TextView>(R.id.tv_job) //직업


    }
}

}