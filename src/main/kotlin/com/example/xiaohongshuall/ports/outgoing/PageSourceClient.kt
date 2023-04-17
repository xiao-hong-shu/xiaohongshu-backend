package com.example.xiaohongshuall.ports.outgoing


interface PageSourceClient {
    fun getPageSource(url: String): String

}
