package uz.gita.homeworkviewpagertask1.adapters

import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import uz.gita.homeworkviewpagertask1.PageViewPager

class AdapterViewPager(fmActivity: FragmentActivity) : FragmentStateAdapter(fmActivity) {
    override fun getItemCount(): Int = 3

    override fun createFragment(position: Int): Fragment {
        val fm = PageViewPager()
        val bundle = Bundle()
        bundle.putInt("POS", position)
        fm.arguments = bundle
        return fm
    }

}