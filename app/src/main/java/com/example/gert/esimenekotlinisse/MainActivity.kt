package com.example.gert.esimenekotlinisse

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import android.util.Log
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        Log.d("MainActivity", "onCreate")
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }

    override fun onDestroy() {
        Log.d("MainActivity", "onDestroy")
        super.onDestroy()
    }

    fun toastMe(view: View) {
        // val myToast = Toast.makeText(this, message, duration);
        val myToast = Toast.makeText(this, "Hello Toast!", Toast.LENGTH_SHORT)
        myToast.show()
    }

    fun editText(view:View){
        val note = editText.text.toString()
        displayTextView.text = note
        Log.d("MainActivity", "Teksti muutmis nuppu vajutati")

    }

    override fun onSaveInstanceState(outState: Bundle?) {
        Log.d("MainActivity", "onSaveInstanceState")
        super.onSaveInstanceState(outState)
        val backup = editText.text
        backupTxtView.text = backup
        outState?.putCharSequence("salvestatudBackupString", backup)
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle?) {
        Log.d("MainActivity", "onRestoreInstance")
        super.onRestoreInstanceState(savedInstanceState)
        val backup = savedInstanceState?.getCharSequence("salvestatudBackupString")
        backupTxtView.text = backup
    }
    fun newActivityBtnClick(view: View) {
        Log.d("MainActivity", "uue activity nuppu vajutati")
        val uueActivityIntent = Intent(this, Main2Activity::class.java)
        val backup = editText.text.toString()
        uueActivityIntent.putExtra(Main2Activity.uusTekst, backup)
        startActivity(uueActivityIntent)
    }

}
