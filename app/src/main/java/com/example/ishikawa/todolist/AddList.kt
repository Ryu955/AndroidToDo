package com.example.ishikawa.todolist

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import kotlinx.android.synthetic.main.activity_add_list.*

class AddList : AppCompatActivity() {

    companion object {
        const val EXTRA_TEXTDATA = ""
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add_list)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        addBtn.setOnClickListener{
            if(editText.text.toString() == ""){
                editText.error = "なにか入力してください"
            }else {
                val intent = Intent(this, MainActivity::class.java)
                intent.putExtra(EXTRA_TEXTDATA, editText.text.toString())
                startActivity(intent)
            }
        }
    }

    override fun onOptionsItemSelected(item: MenuItem?): Boolean {
        when(item?.itemId){
            android.R.id.home -> finish()
            else -> return super.onOptionsItemSelected(item)
        }
        return true
    }


}
