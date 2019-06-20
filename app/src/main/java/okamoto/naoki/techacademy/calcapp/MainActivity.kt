package okamoto.naoki.techacademy.calcapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import android.content.Intent
import java.lang.Exception

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

            button1.setOnClickListener{
                val intent = Intent(this, SecondActivity::class.java)
                try {
                    textView.text = "数値を入力してボタンを押してください。"
                    intent.putExtra(
                        "VALUE",
                        (Edit1.text.toString().toBigDecimal() + Edit2.text.toString().toBigDecimal()).toString()
                    )
                    startActivity(intent)
                }catch (e: Exception){
                    textView.text = "値を正しく入力してください。"
                }
            }

            button2.setOnClickListener{
                val intent = Intent(this, SecondActivity::class.java)
                try {
                    textView.text = "数値を入力してボタンを押してください。"
                    intent.putExtra(
                        "VALUE",
                        (Edit1.text.toString().toBigDecimal() - Edit2.text.toString().toBigDecimal()).toString()
                    )
                    startActivity(intent)
                }catch (e: Exception){
                    textView.text = "値を正しく入力してください。"
                }
            }

            button3.setOnClickListener{
                val intent = Intent(this, SecondActivity::class.java)
                try {
                    textView.text = "数値を入力してボタンを押してください。"
                    intent.putExtra(
                        "VALUE",
                        (Edit1.text.toString().toBigDecimal() * Edit2.text.toString().toBigDecimal()).toString()
                    )
                    startActivity(intent)
                }catch (e: Exception){
                    textView.text = "値を正しく入力してください。"
                }
            }

            button4.setOnClickListener{
                val intent = Intent(this, SecondActivity::class.java)
                try {
                    textView.text = "数値を入力してボタンを押してください。"
                    intent.putExtra(
                        "VALUE",
                        (Edit1.text.toString().toBigDecimal() / Edit2.text.toString().toBigDecimal()).toString()
                    )
                    startActivity(intent)
                }catch (e: Exception){
                    textView.text = "値を正しく入力してください。"
                }
            }
    }
}
