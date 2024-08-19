package com.qburst.libs.printingboilerplate

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform