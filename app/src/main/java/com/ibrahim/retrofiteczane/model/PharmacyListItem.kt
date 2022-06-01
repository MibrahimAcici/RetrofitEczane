package com.ibrahim.retrofiteczane.model

import com.google.gson.annotations.SerializedName

data class PharmacyListItem(

	@field:SerializedName("IlceId")
	val ilceId: Int? = null,

	@field:SerializedName("BolgeAciklama")
	val bolgeAciklama: String? = null,

	@field:SerializedName("EczaneId")
	val eczaneId: Int? = null,

	@field:SerializedName("Adi")
	val adi: String? = null,

	@field:SerializedName("UzaklikMetre")
	val uzaklikMetre: Any? = null,

	@field:SerializedName("Tarih")
	val tarih: String? = null,

	@field:SerializedName("LokasyonY")
	val lokasyonY: String? = null,

	@field:SerializedName("LokasyonX")
	val lokasyonX: String? = null,

	@field:SerializedName("Bolge")
	val bolge: String? = null,

	@field:SerializedName("Telefon")
	val telefon: String? = null,

	@field:SerializedName("Adres")
	val adres: String? = null,

	@field:SerializedName("BolgeId")
	val bolgeId: Int? = null
)