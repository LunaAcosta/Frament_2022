package com.example.frament_2022

import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.inputmethod.InputBinding
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {




    override fun onCreate(savedInstanceState: Bundle?) {



        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
// Llamados de los Fragmentos
        var PrimerF: PrimerFragment
        var SegundoF: SegundoFragment
        var TercerF: TercerFragment



        btn1.setOnClickListener {
            RemplazarFragmento(PrimerFragment())


        }
        btn2.setOnClickListener {
            RemplazarFragmento(SegundoFragment())


        }
        btn3.setOnClickListener {
            RemplazarFragmento(TercerFragment())


        }



    }

    // Metodo para pasar los Fragmentos
    private fun RemplazarFragmento( fragmet: Fragment){

        val fragmentTransaction = supportFragmentManager.beginTransaction()
        fragmentTransaction.replace(R.id.fragmentContainerView3,fragmet)
        fragmentTransaction.addToBackStack(null)
        fragmentTransaction.commit()
    }
}