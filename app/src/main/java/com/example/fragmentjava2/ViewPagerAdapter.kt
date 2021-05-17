package com.example.fragmentjava2

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentStatePagerAdapter

class ViewPagerAdapter(fm:FragmentManager):FragmentStatePagerAdapter(fm) {
    val list= ArrayList<Fragment>()

    fun add(fragment:Fragment){
        list.add(fragment)
    }
    override fun getCount(): Int {
      return  list.size
    }

    override fun getItem(position: Int): Fragment {
        return  list[position]
    }
}