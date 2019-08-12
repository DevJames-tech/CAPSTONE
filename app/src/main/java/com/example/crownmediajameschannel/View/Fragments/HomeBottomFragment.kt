package com.example.crownmediajameschannel.View.Fragments

import androidx.lifecycle.ViewModelProviders
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView

import com.example.crownmediajameschannel.R
import com.example.crownmediajameschannel.ViewModel.HomeBottomViewModel;
import kotlinx.android.synthetic.main.home_bottom_fragment.*



class HomeBottomFragment : Fragment() {

    companion object {
        fun newInstance() = HomeBottomFragment()
    }

    private lateinit var viewModel: HomeBottomViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.home_bottom_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProviders.of(this).get(HomeBottomViewModel::class.java)
        // TODO: Use the ViewModel
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        var textView:TextView  = displayBottom;
        var message = "yooo"
        textView.text = message;

    }
}
