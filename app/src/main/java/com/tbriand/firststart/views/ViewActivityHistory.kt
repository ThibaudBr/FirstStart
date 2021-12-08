package com.tbriand.firststart.views

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.RecyclerView
import com.tbriand.firststart.R
import com.tbriand.firststart.adpater.RecyclerViewFragment
import com.tbriand.firststart.data.DataSource

class ViewActivityHistory(context: Context) : Fragment() {
    // lateinit == assync
    private lateinit var recyclerView : RecyclerView

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val view = inflater.inflate(R.layout.activity_list_product,container,false)

        val myDataset = DataSource().loadFakeProduct()
        recyclerView = view.findViewById(R.id.recycler_view)
        recyclerView.adapter = RecyclerViewFragment(requireContext(), myDataset)
        recyclerView.setHasFixedSize(true)

        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
    }
}