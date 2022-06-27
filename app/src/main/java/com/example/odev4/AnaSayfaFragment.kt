package com.example.odev4

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.navArgs
import androidx.fragment.app.FragmentActivity
import androidx.navigation.Navigation
import com.example.odev4.databinding.FragmentAnaSayfaBinding
import com.google.android.material.snackbar.Snackbar

class AnaSayfaFragment : Fragment() {
    private lateinit var tasarim:FragmentAnaSayfaBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        tasarim = FragmentAnaSayfaBinding.inflate(inflater,container,false)

        tasarim.buttonGitAnaSayfaToA.setOnClickListener {

                Navigation.findNavController(it).navigate(R.id.anasayfaToA)
        }

        tasarim.buttonGitAnaSayfaToX.setOnClickListener {

            Snackbar.make(it,"merhaba",Snackbar.LENGTH_SHORT).show()
            Navigation.findNavController(it).navigate(R.id.anaSayfaToX)
        }
        return tasarim.root
        //inflater.inflate(R.layout.fragment_ana_sayfa, container, false)
    }
}