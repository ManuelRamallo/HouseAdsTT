package com.mramallo.houseadstt.domain.entity

data class Multimedia(
    val images: List<Image>
) {
    companion object {
        fun getMock() = Multimedia(
            images = listOf(
                Image.getMock(),
                Image.getMock(),
                Image.getMock()
            )
        )

        fun getEmpty() = Multimedia(
            images = listOf()
        )
    }
}
