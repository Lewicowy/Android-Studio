package ru.startandroid.weatherapp.adapters

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter

// Используется для отображения фрагментов в виде "пролистываемых" вкладок (например, экранов погоды для разных городов или дней)
// Этот адаптер связывает ViewPager2 со списком фрагментов (Fragment), чтобы можно было перелистывать их свайпом

class VpAdapter(fa: FragmentActivity, private val list: List<Fragment>) : FragmentStateAdapter(fa) {
    override fun getItemCount(): Int {
        return list.size
    }

    override fun createFragment(position: Int): Fragment {
        return list[position]
    }
}