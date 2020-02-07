package cz.kral.gridlayoutadapter

import android.view.LayoutInflater
import android.view.View
import android.widget.GridLayout

class MyInflater<ITEM_VIEW : ItemViewParent, ITEM : Any>(
    private val inflater: LayoutInflater,
    private val layoutId: Int
) {

    /**
     * Column 1 = LinearLayout.
     */
    fun inflateList(list: List<ITEM>, gridLayout: GridLayout, columns: Int = 1) {
        gridLayout.columnCount = columns
        list.forEach {
            val view = getView(it)
            gridLayout.addView(view)
        }
    }

    private fun getView(item: ITEM): View {
        val view = inflater.inflate(layoutId, null) as ITEM_VIEW
        view.fillView(item)
        return view as View
    }
}
