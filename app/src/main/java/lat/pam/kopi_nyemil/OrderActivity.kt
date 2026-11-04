package lat.pam.kopi_nyemil

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import lat.pam.kopi_nyemil.R

class OrderActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_order)

        findViewById<Button>(R.id.btnOrderKirim).setOnClickListener {
            startActivity(Intent(this, ConfirmationActivity::class.java))
        }
    }
}