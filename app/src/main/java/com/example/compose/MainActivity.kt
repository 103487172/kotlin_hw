package com.example.compose

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Html
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import com.example.compose.R

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main);
        supportActionBar!!.title = Html.fromHtml("<font color=\"black\">" + getString(R.string.app_name) + "</font>");
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.nav_menu,menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.nav_attachment -> Toast.makeText(this, "Attach file", Toast.LENGTH_SHORT).show()
            R.id.nav_send -> Toast.makeText(this, "Send email", Toast.LENGTH_SHORT).show()
            R.id.nav_more -> Toast.makeText(this, "More", Toast.LENGTH_SHORT).show()
        }
        return super.onOptionsItemSelected(item)
    }
}