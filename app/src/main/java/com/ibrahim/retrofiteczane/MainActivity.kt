package com.ibrahim.retrofiteczane

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.core.view.isVisible
import com.ibrahim.retrofiteczane.adapter.PharmacyAdapter
import com.ibrahim.retrofiteczane.databinding.ActivityMainBinding
import com.ibrahim.retrofiteczane.model.PharmacyListItem
import com.ibrahim.retrofiteczane.service.PharmacyApi
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    lateinit var pharmacyAdapter:PharmacyAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        initAdapter()
        fetchPharmacies()
    }

    private fun initAdapter() {
        pharmacyAdapter = PharmacyAdapter()
        binding.recyclerView.adapter = pharmacyAdapter
        //LayoutManager activity_main.xml içerisinde
    }

    private fun fetchPharmacies() {
        binding.recyclerView.isVisible = false
        binding.progress.isVisible = true

      val request = PharmacyApi().getPharmacyService().getPharmacies("servisApikeyIsterseBurayaYaz")
        request.enqueue(object :Callback<List<PharmacyListItem>>{
            override fun onResponse(
                call: Call<List<PharmacyListItem>>,
                response: Response<List<PharmacyListItem>>) {
                pharmacyAdapter.setList(response.body() ?: emptyList())
                binding.recyclerView.isVisible = true
                binding.progress.isVisible = false
            }

            override fun onFailure(call: Call<List<PharmacyListItem>>, t: Throwable) {

                binding.recyclerView.isVisible = true
                binding.progress.isVisible = false
            }
        })
    }
}