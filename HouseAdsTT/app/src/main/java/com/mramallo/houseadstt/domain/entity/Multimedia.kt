package com.mramallo.houseadstt.domain.entity

data class Multimedia(
    val images: List<Image>
) {
    companion object {
        fun getMock() = Multimedia(
            images = listOf(
                Image.getEmpty(),
                Image.getEmpty()
            )
        )

        fun getEmpty() = Multimedia(
            images = listOf()
        )
    }
}
