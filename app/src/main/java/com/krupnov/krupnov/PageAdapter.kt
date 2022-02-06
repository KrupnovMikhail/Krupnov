package com.krupnov.krupnov

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.krupnov.krupnov.fragments.HotFragment
import com.krupnov.krupnov.fragments.LatestFragment
import com.krupnov.krupnov.fragments.TopFragment

class PageAdapter(fm: FragmentManager) : FragmentPagerAdapter(fm,
    BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT
) {

    override fun getItem(position: Int): Fragment {
        return when (position) {
            0 -> {
                LatestFragment()
            }
            1 -> TopFragment()
            else -> {
                return HotFragment()
            }
        }
    }

    override fun getCount(): Int {
        return 3
    }

    override fun getPageTitle(position: Int): CharSequence {
        return when (position) {
            0 -> "Последние"
            1 -> "Лучшие"
            else -> {
                return "Горячие"
            }
        }
    }
}