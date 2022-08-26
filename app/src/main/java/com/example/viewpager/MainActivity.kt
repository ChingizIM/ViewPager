package com.example.viewpager

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.viewpager2.widget.ViewPager2
import com.example.viewpager.databinding.ActivityMainBinding
import com.example.viewpager.fragments.ButtonFragment
import com.example.viewpager.fragments.HistoryFragment
import com.example.viewpager.fragments.ResultFragment
import com.example.viewpager.fragments.adapters.ViewPagerAdapter

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {

        binding = ActivityMainBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        val viewPager: ViewPager2 = binding.viewPager

        val fragments: ArrayList<Fragment> = arrayListOf(
            ButtonFragment(),
            ResultFragment(),
            HistoryFragment()
        )
        val adapter = ViewPagerAdapter(fragments, this)
        viewPager.adapter = adapter
    }
}
