package com.pigllet.hchessclock.fragments

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.pigllet.hchessclock.R
import com.pigllet.hchessclock.billings.activities.BuyCoinActivity
import com.pigllet.hchessclock.databinding.FragmentHomeBinding

class HomeFragment : Fragment() {
    private lateinit var binding: FragmentHomeBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        return FragmentHomeBinding.inflate(inflater, container, false).apply {
            binding = this
        }.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.btnStart.setOnClickListener {
            findNavController().navigate(R.id.action_to_clockFragment)
        }
        binding.btnSettings.setOnClickListener {
            findNavController().navigate(R.id.action_to_settingsFragment)
        }
        binding.btnBuy.setOnClickListener {
            startActivity(Intent(activity, BuyCoinActivity::class.java))
        }
    }

}