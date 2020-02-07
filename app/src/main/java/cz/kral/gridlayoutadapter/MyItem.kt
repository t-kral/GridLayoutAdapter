package cz.kral.gridlayoutadapter

import android.content.Context
import android.util.AttributeSet
import android.widget.Button
import android.widget.LinearLayout
import kotlinx.android.synthetic.main.my_item.view.*

data class MyItem(val text: String)

class MyItemView @JvmOverloads constructor(
    context: Context, attrs: AttributeSet? = null, defStyleAttr: Int = 0
) : LinearLayout(context, attrs, defStyleAttr), ItemViewParent {
    override fun fillView(item: Any) {
        item as MyItem
        button.text = item.text
    }

    private var button: Button

    init {
        inflate(context, R.layout.my_item, this)
        button = item_text
    }
}