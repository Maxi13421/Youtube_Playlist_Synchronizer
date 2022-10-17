package com.example.youtube_playlist_synchronizer.ui.main
import android.app.Activity
import android.graphics.Color
import android.os.Bundle
import android.view.View
import android.widget.LinearLayout
import android.widget.TextView
import androidx.fragment.app.Fragment
import com.example.youtube_playlist_synchronizer.R


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
    }

    fun updatetextview(view: Activity, text: String){
        val v = view.findViewById<TextView>(R.id.test)
        v.text = text
    }
}