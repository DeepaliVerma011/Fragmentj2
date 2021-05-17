package com.example.fragmentjava2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.viewpager.widget.ViewPager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

       /* val bundle= Bundle();
        bundle.putString("key","pulkit")
        val fragment=FirstFragment()
        fragment.arguments=bundle
        supportFragmentManager
            .beginTransaction()
            .add(R.id.container,FirstFragment())
            .commitNow()*/
        val viewPagerAdapter=ViewPagerAdapter(supportFragmentManager)
        viewPagerAdapter.apply{
            add(Fragment())
            add(FirstFragment())
            add(SecondFragment())
        }

        viewPager.adapter=viewPagerAdapter


    }
}