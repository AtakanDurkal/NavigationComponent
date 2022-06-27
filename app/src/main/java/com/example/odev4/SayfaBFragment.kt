package com.example.odev4

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.example.odev4.databinding.FragmentSayfaABinding
import com.example.odev4.databinding.FragmentSayfaBBinding

class SayfaBFragment : Fragment() {
    private lateinit var tasarim:FragmentSayfaBBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        tasarim = FragmentSayfaBBinding.inflate(inflater,container,false)
        tasarim.buttonGitBToY.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.sayfaBToY)
        }

        return tasarim.root
        //inflater.inflate(R.layout.fragment_sayfa_b, container, false)
    }



}