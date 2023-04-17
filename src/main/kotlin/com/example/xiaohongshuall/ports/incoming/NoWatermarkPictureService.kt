package com.example.xiaohongshuall.ports.incoming

interface NoWatermarkPictureService {
    fun getNoWaterMarkPictureBy(url: String): List<String>
}
