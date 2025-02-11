package com.mramallo.houseadstt.domain.entity

data class Image(
    val url: String,
    val tag: String,
) {
    companion object {
        fun getMock(): Image =
            Image(
                url = "https://img4.idealista.com/blur/WEB_LISTING-M/0/id.pro.es.image.master/58/60/32/1273036727.webp",
                tag = "livingRoom"
            )
        fun getEmpty(): Image =
            Image(
                url = "",
                tag = ""
            )
    }
}
