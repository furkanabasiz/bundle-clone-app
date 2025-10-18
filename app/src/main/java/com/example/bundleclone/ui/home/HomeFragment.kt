package com.example.bundleclone.ui.home

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.bundleclone.HomeRVAdapter
import com.example.bundleclone.R
import com.example.bundleclone.data.HomeNews

class HomeFragment : Fragment() {

    private lateinit var newsList: ArrayList<HomeNews>
    private lateinit var rv: RecyclerView
    private lateinit var adapter: HomeRVAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_home, container, false)

        rv = view.findViewById(R.id.homeRv)
        rv.setHasFixedSize(true)
        rv.layoutManager = LinearLayoutManager(requireContext())

        //Sample data
        val s1 = HomeNews("Sample News","Sample Resource", R.drawable.sampleimage,"null")
        val s2 = HomeNews("Sample News","Sample Resource", R.drawable.sampleimage,"null")

        newsList = ArrayList<HomeNews>()
        newsList.add(s1)
        newsList.add(s2)

        adapter = HomeRVAdapter(requireContext(),newsList)
        rv.adapter = adapter

        return view

    }
}