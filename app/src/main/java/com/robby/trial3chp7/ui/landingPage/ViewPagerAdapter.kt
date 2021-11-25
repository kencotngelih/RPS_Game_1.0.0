package com.robby.trial3chp7.ui.landingPage

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter

class ViewPagerAdapter(
    fa: FragmentActivity,listener: (CharSequence) -> Unit
) : FragmentStateAdapter(fa) {
    private val dataFragments = mutableListOf(
        SecondFragment.newInstance("Bermain suit melawan sesama pemain.",listener),
        SecondFragment.newInstance("Bermain suit melawan komputer.",listener),
        SecondFragment.newInstance("Cek profile dan daftar teman.",listener)
    )

    override fun getItemCount(): Int = 3
    override fun createFragment(position: Int): Fragment = dataFragments[position]
}