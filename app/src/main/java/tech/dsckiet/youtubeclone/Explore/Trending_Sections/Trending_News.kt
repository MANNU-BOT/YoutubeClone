package tech.dsckiet.youtubeclone.Explore.Trending_Sections

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import tech.dsckiet.youtubeclone.R

/**
 * A simple [Fragment] subclass.
 */
class Trending_News : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_trending__news, container, false)
    }

}
