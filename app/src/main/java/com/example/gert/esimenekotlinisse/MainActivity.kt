package com.example.gert.esimenekotlinisse

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onDestroy() {
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

    }

    override fun onSaveInstanceState(outState: Bundle?, outPersistentState: PersistableBundle?) {
        super.onSaveInstanceState(outState, outPersistentState)
        val backup = editText.text
        backupTxtView.text = backup
        outState?.putCharSequence("salvestatudBackupString", backup)
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
        super.onRestoreInstanceState(savedInstanceState, persistentState)
        val backup = savedInstanceState?.getCharSequence("salvestatudBackupString")
        editText.setText(backup)
    }
    fun newActivityBtnClick(view: View) {
        val uueActivityIntent = Intent(this, Main2Activity::class.java)
        val backup = editText.text.toString()
        uueActivityIntent.putExtra(Main2Activity.uusTekst, backup)
        startActivity(uueActivityIntent)
    }
}
