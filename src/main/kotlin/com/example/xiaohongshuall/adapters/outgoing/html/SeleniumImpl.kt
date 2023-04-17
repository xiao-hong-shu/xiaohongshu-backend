package com.example.xiaohongshuall.adapters.outgoing.html

import com.example.xiaohongshuall.ports.outgoing.PageSourceClient
import org.springframework.stereotype.Component

@Component
class SeleniumImpl : PageSourceClient {
    override fun getPageSource(url: String): String {
        TODO("Not yet implemented")
    }
}