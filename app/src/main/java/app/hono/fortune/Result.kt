package app.hono.fortune

import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_result.*
import kotlin.random.Random

class Result : AppCompatActivity() {

    val n = Random.nextInt(4)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)

        if (n == 0) {
            resultImage.setImageResource(R.drawable.daikichi)
            resultText.text = "強運の持ち主！"
            resultText.setTextColor(Color.rgb(216,0,0))
        } else if (n ==1) {
            resultImage.setImageResource(R.drawable.kichi)
            resultText.text = "いいことがあるかも！？"
            resultText.setTextColor(Color.rgb(0,21,109))
        } else if (n ==2) {
            resultImage.setImageResource(R.drawable.chuukichi)
            resultText.text = "油断大敵！"
            resultText.setTextColor(Color.rgb(225,110,0))
        } else {
            resultImage.setImageResource(R.drawable.kyou)
            resultText.text = "用心してね！"
            resultText.setTextColor(Color.rgb(135,0,173))
        }

        val intent:Intent = Intent(this,MainActivity::class.java)
        restart.setOnClickListener {
            startActivity(intent)
        }
    }
}
