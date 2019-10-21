package com.ariel.store

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import org.jetbrains.anko.startActivity
import org.jetbrains.anko.toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        toast("Mnesaje toas corto desde anko")

        /*txtView.setOnClickListener{
                startActivity<DetailActivity>("text" to "Hola desde Anko")
        }*/


    }
}
