package com.rizky.submision

import java.util.*


object ClothesData {
    private val clothNames = arrayOf(
        "Pakaian Adat Bali",
        "Pakaian Adat Bangka Belitung",
        "Pakaian Adat Gorontalo",
        "Pakaian Adat Jawa Tengah",
        "Pakaian Adat Kalimantan Selatan",
        "Pakaian Adat Kalimantan Tengah",
        "Pakaian Adat Kalimantan Timur",
        "Pakaian Adat Kalimantan Utara",
        "Pakaian Adat Lampung",
        "Pakaian Adat Maluku",
        "Pakaian Adat Sulawesi Barat",
        "Pakaian Adat Yogyakarta"
    )

    private val clothDetails = arrayOf(
        "Pakaian adat bali ini memiliki banyak jenis, walaupun sekilas memiliki bentuk yang mirip. Masing-masing baju adat dari daerah bali memiliki ciri yang ornamen dan simbolik, di bedakan dalam acara upacara, umur, dan jenis kelamin yang memakainya.  Kita bisa membedakan status sosial masyaraktnya berdasarkan corak busana dan perhiasan yang di milkinya.",
        "Pakaian adat dari Bangka Belitung ini biasanya di sebut dengan paksian. Kalau buat kaum perempuan kebanyakan memakai baju kurung yang berwarna merah yang mana bahannya dari kain sutra dan juga di kepalanya biasanya memakai mahkota yang mana di sebut dengan paksian.",
        "Pakaian adat tradisional ini biasanya di sebut dengan Billu (pakaian mempelai putri) dan Mukuta  (pakaian pengantin putra). Pakaian adat ini biasanya memiliki tiga warna dan mempunyai arti tersendiri, warna itu ialah kuning keemasan, warna hijau, dan warna ungu.",
        "Pakaian adat yang berasal dari Jawa Tengah lebih di kenal dengan menggunakan kain kebaya yang memakai motif batik, yang mana batik tersebut merupakan batik yang masih asli.",
        "Terdapat banyak jenis pakaian adat dari suku banjar yang asalnya dari Provinsi Kalimantan Selatan, diantaranya bagajah gamuling baular lulut, pengantin babaju kun galung pacinan, pengantin baamar galung pancar matahari, dan pengantin babaju kubaya panjang.",
        "Dalam kehidupan masyarakat Kalimantan tengah Pengantin lak-laki harus memakai celana panjang yang mencapai lutut, tali pinggang, selempit perak, dan memakai tutup kepala. Selain itu juga memakai perhiasan yang terdiri dari inuk atau kalung yang panjang ,cengkoang yang di buat dari gigi hewan. Untuk wanita nya sendiri memakai kain berupa rok yang pendek, ikat kepala, kalung, subang, hiasan bulu enggang dan rompi.",
        "Masyarakat sekitar menggunakan pakaian adat ini biasanya berdasarkan kegunaan mereka sehari-hari. Misalnya untuk pakaian dalam upacara adat dan saat menari pun pakaian itu sudah berbeda.",
        "Berada di ujung utara dari pulau Kalimantan. Meskipun wilayahnya yang luas yaitu sekitar 75.467,70 km², namun jumlah populasi penduduknya tergolong sedikit yaitu sekitar 600 ribu jiwa. Sebagian besar penduduknya didominasi oleh suku Dayak.",
        "Pakaian adat yang berasal dari Lampung ini bila kita amati banyak di temukan perbedaan antara Lampung bagian pesisir dan Lampung daratan namun walau memiliki sedikit perbedaan yaitu masih ada kesamaan yaitu masih sama-sama menggunakan kain tapis di hiasi oleh logam kuningan yang mempercantik dan terkesan sangat glamor, yang di maksud kain tapis di sini adalah sebuah kain yang di tenun dengan proses yang masih manual  dengan memakai tinta emas yang di cetak dengan tangan terampil sehingga terbentuklah kain tapis yang sangat cantik dan pakaian tersebut jika di pakai oleh pengantin terlihat akan sangat berkharisma.",
        "Baju cele memiliki ciri berkotak-kotak kecil dan geometris bergaris-garis. Pada umumnya baju ini di padukan dengan sarung yang mempunyai warna yang tak jauh berbeda, yang terpenting harus serasi dan seimbang. Baju cele ini hanya di pakai untuk upacara adat.",
        "Sarung sutra dari mandar nampak mirip dengan kain sutra pada umumnya, tapi di setiap jenis masing-masing memilik ciri yang berbeda yaitu dari corak dan cara membuatnya.",
        "Pakaian ini ini terdiri atas sepasang pakaian tradisional yang mempunyai bagian penting yang tidak bisa dapat di pisahkan antara satu dan lainnya. Perlengkapan berpakaian tersebut adalah ciri khusus untuk memberikan identitas yang sangat penting. Sebab itu tidak boleh memakai pakaian ini secara sembarangan, oleh sebab  itu pakaian ini adalah pakaian sakral yang harus kita jaga dan kita rawat."
    )

    private val clothImages = intArrayOf(
        R.drawable.bali,
        R.drawable.bangka_belitung,
        R.drawable.gorontalo,
        R.drawable.jawa_tengah,
        R.drawable.kalimantan_selatan,
        R.drawable.kalimantan_tengah,
        R.drawable.kalimantan_timur,
        R.drawable.kalimantan_utara,
        R.drawable.lampung,
        R.drawable.maluku,
        R.drawable.sulawesi_barat,
        R.drawable.yogyakarta
    )

    val listData: ArrayList<Clothes>
        get() {
            val list = arrayListOf<Clothes>()
            for (position in clothNames.indices) {
                val cloth = Clothes()
                cloth.name = clothNames[position]
                cloth.detail = clothDetails[position]
                cloth.photo = clothImages[position]
                list.add(cloth)
            }
            return list
        }
}