package tech.dsckiet.youtubeclone.Explore.Music_Sections

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import tech.dsckiet.youtubeclone.R

/**
 * A simple [Fragment] subclass.
 */
class Music_About : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_music__about, container, false)
    }

}
