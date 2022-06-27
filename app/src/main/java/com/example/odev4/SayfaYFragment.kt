package com.example.odev4

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.activity.OnBackPressedCallback
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import com.example.odev4.databinding.FragmentAnaSayfaBinding
import com.example.odev4.databinding.FragmentSayfaYBinding


class SayfaYFragment : Fragment() {
    private lateinit var tasarim:FragmentSayfaYBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return tasarim.root
        //inflater.inflate(R.layout.fragment_sayfa_y, container, false)
    }

}