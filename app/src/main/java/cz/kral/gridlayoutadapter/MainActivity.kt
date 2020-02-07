package cz.kral.gridlayoutadapter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import cz.kral.gridlayoutadapter.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding: ActivityMainBinding =
            DataBindingUtil.setContentView(this, R.layout.activity_main)

        val list = listOf(MyItem("abc"), MyItem("def"), MyItem("ghi"), MyItem("jkl"))
        val myInflater = MyInflater<MyItemView, MyItem>(layoutInflater, R.layout.my_item_row)

        myInflater.inflateList(list, binding.myGridLayout, 3)
    }
}