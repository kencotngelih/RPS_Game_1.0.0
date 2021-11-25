package com.robby.trial3chp7.ui.landingPage

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import com.robby.trial3chp7.R

private const val ARG_PARAM1 = "param1"

class SecondFragment : Fragment() {
    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private lateinit var listener: (CharSequence) -> Unit
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_second, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val title by lazy{view.findViewById<TextView>(R.id.title)}
        val image1 by lazy{view.findViewById<ImageView>(R.id.image1)}
        val image2 by lazy{view.findViewById<ImageView>(R.id.image2)}
        val image3 by lazy{view.findViewById<ImageView>(R.id.image3)}
        title.text = param1
        when(param1){
            "Bermain suit melawan sesama pemain."->{
                image1.visibility = View.VISIBLE
            }
            "Bermain suit melawan komputer."->{
                image2.visibility = View.VISIBLE
            }
            "Cek profile dan daftar teman."->{
                image3.visibility = View.VISIBLE
            }
        }


    }

    companion object {
        @JvmStatic
        fun newInstance(param1: String, listener: (CharSequence) -> Unit) =
            SecondFragment().apply {
                this.listener = listener
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                }
            }
    }
}