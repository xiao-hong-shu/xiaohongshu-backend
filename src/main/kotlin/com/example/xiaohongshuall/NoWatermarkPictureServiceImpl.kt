package com.example.xiaohongshuall

import com.example.xiaohongshuall.ports.incoming.NoWatermarkPictureService
import com.example.xiaohongshuall.ports.outgoing.PageSourceClient
import org.springframework.stereotype.Service

@Service
class NoWatermarkPictureServiceImpl(private val pageSourceClient: PageSourceClient) : NoWatermarkPictureService {

    override fun getNoWaterMarkPictureBy(url: String): List<String> {
        val pageSource = pageSourceClient.getPageSource(url)
        return listOf(pageSource)
    }

}