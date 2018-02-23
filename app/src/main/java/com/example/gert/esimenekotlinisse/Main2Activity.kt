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
            Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                    .setAction("Action", null).show()
        }
    }

    fun showRandomNumber() {
        // Get the count from the intent extras
        val vaartus = intent.getStringExtra(uusTekst)

        // Generate the random number
        //val random = Random()
        //var randomInt = 0
        //// Add one because the bound is exclusive
        //if (count > 0) {
        //    // Add one because the bound is exclusive
        //    randomInt = random.nextInt(count + 1)
        //}

        // Display the random number.
        uueIntendiTekst.text = vaartus

        // Substitute the max value into the string resource
        // for the heading, and update the heading
        //textview_label.text = getString(R.string.random_heading, count)
    }
}
