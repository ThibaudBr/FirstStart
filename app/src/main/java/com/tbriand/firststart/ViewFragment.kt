package com.tbriand.firststart

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.tbriand.firststart.views.ViewActivityBookMark
import com.tbriand.firststart.views.ViewActivityHistory
import com.tbriand.firststart.views.ViewActivityProfil
import com.tbriand.firststart.views.ViewActivityTchart
import kotlinx.android.synthetic.main.fragment_main.*

class ViewFragment(context: Context) : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(
            R.layout.fragment_main,
            container,
            false
        )
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        childFragmentManager?.beginTransaction()
            ?.replace(R.id.product_details_nav_host, ViewActivityHistory(requireContext()))
            ?.commitAllowingStateLoss();


        product_details_bottom_nav.setOnNavigationItemSelectedListener { menu ->
            childFragmentManager.beginTransaction()

                .replace(
                    R.id.product_details_nav_host,
                    when (menu.itemId) {
                        R.id.cart_menu -> ViewActivityHistory(requireContext())
                        R.id.bookmarks_menu -> ViewActivityBookMark()
                        R.id.stats_menu -> ViewActivityTchart()
                        R.id.profile_menu -> ViewActivityProfil()
                        else -> throw Exception()
                    }

                )


                .commitAllowingStateLoss()
            true
        }

    }
}