package com.example.challangechapter3

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import org.w3c.dom.Text

class DetailInformation : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view:View =inflater.inflate(R.layout.fragment_detail_information, container, false)
        return view;

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setOnclickLocation()
        val makanan = arguments?.getParcelable<ModalData>("data")
        if(makanan != null){
            val namaMakanan :TextView = view.findViewById(R.id.namaMakanan)
            val gambarMakanan:ImageView = view.findViewById(R.id.iv_image1)
            val hargaMakanan : TextView = view.findViewById(R.id.hargaMakanan)
            val deskripsi: TextView = view.findViewById(R.id.description)
            val alamatToko:TextView = view.findViewById(R.id.alamatToko)

            namaMakanan.text = makanan.namaMakanan
            gambarMakanan.setImageResource(makanan.image)
            hargaMakanan.text = makanan.hargaMakanan
            deskripsi.text = makanan.deskripsi
            alamatToko.text = makanan.alamatToko

        }
    }

    private fun setOnclickLocation(){
        view?.findViewById<TextView>(R.id.tv_1)?.setOnClickListener{
            navigateToMaps()
        }
    }



    private fun navigateToMaps(){
        val b = Intent(Intent.ACTION_VIEW, Uri.parse("https://maps.app.goo.gl/h4wQKqaBuXzftGK77")
        )
        startActivity(b)
    }

}