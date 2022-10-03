package com.reyndev.scrollablelist.data

import com.reyndev.scrollablelist.R
import com.reyndev.scrollablelist.model.StringItem

class DataSource {
    fun loadStringItem(): List<StringItem> {
        return listOf<StringItem>(
            StringItem(R.string.item1),
            StringItem(R.string.item2),
            StringItem(R.string.item3),
            StringItem(R.string.item4),
            StringItem(R.string.item5),
            StringItem(R.string.item6),
            StringItem(R.string.item7),
            StringItem(R.string.item8),
            StringItem(R.string.item9),
            StringItem(R.string.item10),
        )
    }
}