package com.example.challangechapter3

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.GridLayout
import android.widget.ImageButton
import androidx.navigation.Navigation
import androidx.navigation.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.LayoutManager
import com.example.challangechapter3.databinding.ActivityMainBinding

class HomeFargment : Fragment() {
    // TODO: Rename and change types of parameters
    private lateinit var recycleview: RecyclerView
    private lateinit var listMenu: ArrayList<ModalData>
    private lateinit var myAdapter: MyAdapter


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view: View = inflater.inflate(R.layout.fragment_home_fargment, container, false)
        return view;
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val listMenu = arrayListOf(
            ModalData(
                "Ayam Bakar",
                "Rp. 35.000",
                R.drawable.ayam_spicy,
                "Ayam Spicy Ayam Pilihan kita semua",
                "Jl. BSD Green Office Park Jl. BSD Grand Boulevard, Sampora, BSD, Kabupaten Tangerang, Banten 15345"
            ),
            ModalData(
                "Ayam Spicy",
                "Rp. 45.000",
                R.drawable.ayam_spicy,
                "Ayam Crispy adalah hidangan yang sangat populer di seluruh dunia, terutama di restoran cepat saji dan warung makan. Hidangan ini memiliki ciri khas ayam yang digoreng hingga menjadi renyah dan garing di luar, sementara dagingnya tetap lembut dan juicy di dalam.",
                "Jl. BSD Green Office Park Jl. BSD Grand Boulevard, Sampora, BSD, Kabupaten Tangerang, Banten 15345"
            ),
            ModalData(
                "Paket Hemat",
                "Rp. 70.000",
                R.drawable.paket_hemat,
                "Paket Hemat ini di rekomendasikan untuk yang makannya banyak karena mencakup beberapa variasi menu",
                "Jl. BSD Green Office Park Jl. BSD Grand Boulevard, Sampora, BSD, Kabupaten Tangerang, Banten 15345"
            ),
            ModalData(
                "Pizza",
                "Rp. 80.000",
                R.drawable.pizza,
                "Pizza adalah hidangan yang terkenal di seluruh dunia dan memiliki banyak variasi rasa dan topping",
                "Jl. BSD Green Office Park Jl. BSD Grand Boulevard, Sampora, BSD, Kabupaten Tangerang, Banten 15345"
            ),
            ModalData(
                "Sushi",
                "Rp. 95.000",
                R.drawable.sushi,
                "Sushi adalah hidangan tradisional Jepang yang terkenal di seluruh dunia. Ini adalah hidangan yang menggabungkan nasi yang dicampur dengan cuka beras, dilapisi dengan berbagai bahan seperti ikan, daging laut, sayuran, dan saus",
                "Jl. BSD Green Office Park Jl. BSD Grand Boulevard, Sampora, BSD, Kabupaten Tangerang, Banten 15345"
            ),
            ModalData(
                "Ayam Bakar",
                "Rp. 50.000",
                R.drawable.sushi,
                "Ayam Spicy Ayam Pilihan kita semua",
                "Jl. BSD Green Office Park Jl. BSD Grand Boulevard, Sampora, BSD, Kabupaten Tangerang, Banten 15345"
            ),
            ModalData(
                "Ayam Bakar",
                "Rp. 50.000",
                R.drawable.sushi,
                "Ayam Spicy Ayam Pilihan kita semua",
                "Jl. BSD Green Office Park Jl. BSD Grand Boulevard, Sampora, BSD, Kabupaten Tangerang, Banten 15345"
            ),

            )

        val adapter = MyAdapter(listMenu)
        val linearLayoutManager = LinearLayoutManager(context)
        recycleview = view.findViewById(R.id.recycleview)
        recycleview.layoutManager = linearLayoutManager
        recycleview.adapter = adapter




        adapter.onItemClick = {
            val bundle = Bundle()
            bundle.putParcelable("data", it)
            view.findNavController().navigate(R.id.action_homeFargment_to_detailInformation, bundle)

        }
    }
}

