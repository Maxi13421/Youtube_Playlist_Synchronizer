package com.example.youtube_playlist_synchronizer.ui.main
import android.app.Activity
import android.graphics.Color
import android.os.Bundle
import android.view.View
import android.widget.LinearLayout
import android.widget.TextView
import androidx.fragment.app.*
import com.example.youtube_playlist_synchronizer.R
import com.example.youtube_playlist_synchronizer.rounded_box


object StatusFragment : Fragment(R.layout.status){


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)



    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val v = view.findViewById<LinearLayout>(R.id.linearl)
        val textView = TextView(this.context)
        textView.text = "Child Row"
        textView.id = R.id.test
        textView.setTextColor(Color.parseColor("#FFFFFFFF"))
        v.addView(textView)




        if (savedInstanceState == null) {
            val fragconv = FragmentContainerView(this.requireContext())
            fragconv.id = R.id.testfrag
            val f = rounded_box()
            requireActivity().supportFragmentManager.commit {
                setReorderingAllowed(true)
                add(R.id.testfrag, f)
            }
            v.addView(fragconv)
        }
        if (savedInstanceState == null) {
            val fragconv2 = FragmentContainerView(this.requireContext())
            fragconv2.id = R.id.testfrag2
            val g = rounded_box()
            requireActivity().supportFragmentManager.commit {
                setReorderingAllowed(true)
                add(R.id.testfrag2,g)
            }
            v.addView(fragconv2)
        }

    }

    fun updatetextview(view: Activity, text: String){
        val v = view.findViewById<TextView>(R.id.test)
        v.text = text
    }
}