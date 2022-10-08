package com.aya.navapp.onBoarding

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.viewpager2.widget.ViewPager2
import com.aya.navapp.R
import com.aya.navapp.ViewPager
import com.aya.navapp.ViewPager2Adapter
import com.aya.navapp.screens.firstScreen
import com.aya.navapp.screens.scondScreen

class viewPager : Fragment() {

        private val viewList by lazy {
            ArrayList<ViewPager>()
        }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val idx = ViewPager(R.drawable.first,"Hello ,First Page")
        val idx1 = ViewPager(R.drawable.second,"Hello ,Second Page")
        viewList.add(idx)
        viewList.add(idx1)
       var veiwPager2init:ViewPager2 =view.findViewById(R.id.ayaViewPager)
        veiwPager2init.adapter=ViewPager2Adapter(viewList)

    }
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
       val view= inflater.inflate(R.layout.fragment_view_pager, container, false)


       // view.viewPager.adapter=adapter
        return view



    }
}