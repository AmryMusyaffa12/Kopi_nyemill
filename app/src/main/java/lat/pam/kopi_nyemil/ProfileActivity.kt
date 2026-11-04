package lat.pam.kopi_nyemil

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import lat.pam.kopi_nyemil.R

class ProfileActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)

        findViewById<Button>(R.id.btnSaveProfile).setOnClickListener {
            finish()
        }
        findViewById<TextView>(R.id.navHome).setOnClickListener {
            startActivity(Intent(this, HomeActivity::class.java))
            finish()
        }
        findViewById<TextView>(R.id.navOrder).setOnClickListener {
            startActivity(Intent(this, OrderActivity::class.java))
            finish()
        }
    }
}