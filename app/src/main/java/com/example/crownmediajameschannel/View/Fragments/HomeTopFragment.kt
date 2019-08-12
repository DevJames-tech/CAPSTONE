package com.example.crownmediajameschannel.View.Fragments

import androidx.lifecycle.ViewModelProviders
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.FragmentManager

import androidx.recyclerview.widget.LinearLayoutManager
import com.example.crownmediajameschannel.Model.Adapter.VideosRecyclerViewAdapter
import com.example.crownmediajameschannel.R
import com.example.crownmediajameschannel.ViewModel.HomeTopViewModel
import androidx.recyclerview.widget.RecyclerView
import com.example.crownmediajameschannel.Model.Adapter.AdapterPager

import kotlinx.android.synthetic.main.home_top_fragment.*
import kotlinx.android.synthetic.main.home_bottom_fragment.displayBottom;
import kotlinx.android.synthetic.main.recyclerview_main.recyclerViewMain;


class HomeTopFragment : Fragment() {

    private lateinit var getListValues:ArrayList<String>;
    private lateinit var adapterPagerInstance: AdapterPager
    private lateinit var topFragmentInstance:HomeTopFragment;
    private lateinit var recyclerViewAdapterInstance: VideosRecyclerViewAdapter;
   private lateinit var homeTopViewModelInstance: HomeTopViewModel




    private  lateinit var viewModel: HomeTopViewModel;


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        var recyclerView: RecyclerView = RecyclerView(this.requireContext())


        recyclerViewAdapterInstance = VideosRecyclerViewAdapter();
        recyclerView.layoutManager = LinearLayoutManager(this.context) ;
        recyclerView.adapter = recyclerViewAdapterInstance;

        recyclerView.layoutManager = LinearLayoutManager(this.context);

        recyclerView.adapter = recyclerViewAdapterInstance;
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        //recyclerViewAdapterInstance = VideosRecyclerViewAdapter();





        return inflater.inflate(R.layout.home_top_fragment, container, false);
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        viewModel = ViewModelProviders.of(this).get(HomeTopViewModel::class.java)
        // TODO: Use the ViewModel
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
//botttom frag is null also

        val textView: TextView = displayTopFragment;
        var message: String? = arguments?.getString("Array Items");

        Log.d("Frag", message.toString())
        textView.text = message;




    }
}
