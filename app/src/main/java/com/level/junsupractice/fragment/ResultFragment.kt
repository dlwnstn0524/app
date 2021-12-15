package com.level.junsupractice.fragment


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.NavController
import androidx.navigation.Navigation

import com.level.junsupractice.R
import kotlinx.android.synthetic.main.fragment_result.*

class ResultFragment : Fragment() {


    var option = -1

    lateinit var navController: NavController




    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment

        option = arguments?.getInt("index")?:-1

        return inflater.inflate(R.layout.fragment_result, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        navController = Navigation.findNavController(view)
        setResult(option)


        btn_home.setOnClickListener {
            navController.navigate(R.id.action_resultFragment_to_mainFragment)
        }
    }

    fun setResult(option : Int){

        when(option){
            1 -> {
                main_textView.text = "You are a QUITTER!"
                sub_textView.text ="You can let the person easily."
            }

            2 -> {
                main_textView.text="You should focus on yourself"
                sub_textView.text="You become really clingy to your ex."

            }

            3-> {
                main_textView.text="You should take it easy"
                sub_textView.text="You can do crazy things no matter what it takes."
            }

            4-> {
                main_textView.text="You are pretty mature."
                sub_textView.text="You can easily accept the break-up."
            }
        }
    }
}
