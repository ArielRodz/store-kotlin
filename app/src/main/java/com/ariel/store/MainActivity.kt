package com.ariel.store

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import kotlinx.android.synthetic.main.activity_main.*
import org.jetbrains.anko.startActivity
import org.jetbrains.anko.toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        rcViewLanding.layoutManager = GridLayoutManager(this, 2)
        val itemsShop = (0..20).map{
            ItemLanding("Title $it", "Descri $it", 200.00+ it)
        }

        val adapter = AdapterLanding(itemsShop)
        rcViewLanding.adapter = adapter


    }
}
