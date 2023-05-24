package com.example.myapplication

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.myapplication.databinding.FragmentHomeBinding

class HomeFragment : Fragment() {

    private var _binding : FragmentHomeBinding? = null
    private val binding get() = _binding!!

    lateinit var homeRecyclerViewAdapter : HomeRecyclerViewAdapter

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentHomeBinding.inflate(inflater, container, false)
        init()
        return binding.root
    }

    private fun init(){
        binding.apply {
            homeRecyclerViewAdapter = HomeRecyclerViewAdapter(getData())
            homeRecyclerView.layoutManager = LinearLayoutManager(context)
            homeRecyclerView.adapter = homeRecyclerViewAdapter
        }
    }

    private fun getData(): MutableList<HomeItem> {
        val items = ArrayList<HomeItem>()
        items.add(HomeItem("keti","sikharulidze"))
        items.add(HomeItem("luka","berianidze"))
        items.add(HomeItem("david","taniani"))
        items.add(HomeItem("nikoloz","robakidze"))
        items.add(HomeItem("nika","tarashvili"))
        items.add(HomeItem("leqso","guraspishvili"))
        items.add(HomeItem("levan","revazishvili"))
        items.add(HomeItem("demetre","chakvetadze"))
        return items
    }
}