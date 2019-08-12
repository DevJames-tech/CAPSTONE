package com.example.crownmediajameschannel.Model.Adapter

import android.os.Bundle
import android.util.Log
import androidx.constraintlayout.widget.Placeholder
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentStatePagerAdapter
import com.example.crownmediajameschannel.View.Fragments.HomeTopFragment

class AdapterPager(fragmentManager: FragmentManager?, mockArrayList: ArrayList<String>) : FragmentStatePagerAdapter(fragmentManager) {

    private var mockDataArrayList = ArrayList<String>(5);
  //grab value from constructor and use it in methods
    init {

        this.mockDataArrayList = mockArrayList;
    }

      override fun getItem(position: Int): Fragment {

          val topFragmentHomeInstance: HomeTopFragment = HomeTopFragment();
          var bundleUp = Bundle();

         //need position of array element

          mockDataArrayList.add("hello")

          Log.d("hellloguy", mockDataArrayList[position])

         bundleUp.putString("Array Items", mockDataArrayList[position])
          Log.d("Log",bundleUp.toString())

      var position = position + 1;
        //bundleUp.putString("message","Hello From Page:"+ position)

          topFragmentHomeInstance.arguments = bundleUp;
          return topFragmentHomeInstance;
      }


      override fun getCount(): Int {

          return 5;
      }

  }


