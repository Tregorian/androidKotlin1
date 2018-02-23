package com.example.gert.esimenekotlinisse

import android.os.Bundle
import android.support.design.widget.Snackbar
import android.support.v7.app.AppCompatActivity

import kotlinx.android.synthetic.main.activity_main2.*
import kotlinx.android.synthetic.main.content_main2.*
import java.util.*

class Main2Activity : AppCompatActivity() {

    companion object {
        const val uusTekst = "total_count"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        setSupportActionBar(toolbar)

        fab.setOnClickListener { view ->
            Snackbar.make(view, "It's ya boiii", Snackbar.LENGTH_LONG)
                    .setAction("Action", null).show()
        }

        val vaartus = intent.getStringExtra(uusTekst)
        uueIntendiTekst.text = vaartus
    }


}
