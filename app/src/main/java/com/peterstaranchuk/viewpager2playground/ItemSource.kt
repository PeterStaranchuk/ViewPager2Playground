package com.peterstaranchuk.viewpager2playground

class ItemSource {

    fun getItems(): Array<Item> { //imitate response from server
        return arrayOf(
            Item("First element", "#A9CCE3"),
            Item("Second element", "#7FB3D5"),
            Item("Third element", "#21618C"),
            Item("Fourth element", "#1B4F72")
        )
    }
}