package com.ibrahim.retrofiteczane.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.ibrahim.retrofiteczane.databinding.ItemPharmacyBinding
import com.ibrahim.retrofiteczane.model.PharmacyListItem

class PharmacyAdapter() : RecyclerView.Adapter<PharmacyAdapter.PharmacyVH>() {

    private var pharmacyList: ArrayList<PharmacyListItem> = arrayListOf()

    fun setList(newList: List<PharmacyListItem>) {
        this.pharmacyList.clear()
        this.pharmacyList.addAll(newList)
        notifyDataSetChanged()
    }

    inner class PharmacyVH(val binding:ItemPharmacyBinding) : RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PharmacyVH {
        return PharmacyVH(ItemPharmacyBinding.inflate(LayoutInflater.from(parent.context),parent,false))
    }

    override fun onBindViewHolder(holder: PharmacyVH, position: Int) {
        val pharmacy = pharmacyList[position]

        holder.binding.tvPharmacyName.text = pharmacy.adi
        holder.binding.tvPharmacyPhone.text = pharmacy.telefon
        holder.binding.tvPharmacyAddress.text = pharmacy.adres

    }

    override fun getItemCount(): Int = pharmacyList.size
}