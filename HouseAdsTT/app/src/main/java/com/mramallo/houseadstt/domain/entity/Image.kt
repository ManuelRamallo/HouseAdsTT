package com.mramallo.houseadstt.domain.entity

data class Image(
    val url: String,
    val tag: String,
) {
    companion object {
        fun getEmpty(): Image =
            Image(
                url = "",
                tag = ""
            )
    }
}
