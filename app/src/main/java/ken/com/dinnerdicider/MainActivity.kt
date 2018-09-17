package ken.com.dinnerdicider

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    val listFood: MutableList<String> = ArrayList()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        addFoodBtn.setOnClickListener() {
            listFood.add(editText.text.toString())
            editText.text.clear()
        }
        decideBtn.setOnClickListener() {
            listFood.shuffle()
            selectedFood.text = listFood[0]
        }
    }


}
