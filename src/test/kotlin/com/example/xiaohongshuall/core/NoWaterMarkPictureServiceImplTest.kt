package com.example.xiaohongshuall.core

import com.example.xiaohongshuall.NoWatermarkPictureServiceImpl
import com.example.xiaohongshuall.ports.outgoing.PageSourceClient
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith
import org.mockito.InjectMocks
import org.mockito.Mock
import org.mockito.junit.jupiter.MockitoExtension
import org.mockito.kotlin.verify
import org.mockito.kotlin.whenever
import java.net.URL
import java.util.*

@ExtendWith(MockitoExtension::class)
class NoWaterMarkPictureServiceImplTest {

    @InjectMocks
    private lateinit var noWatermarkPictureService: NoWatermarkPictureServiceImpl

    @Mock
    private lateinit var pageSourceClient: PageSourceClient


    @Test
    fun `should get all no watermark picture url by given xiaohongshu url`() {
        val originalUrl = UUID.randomUUID().toString()
        val expectedNoWatermarkURL = URL("https://xiaohongshu.com").toString()

        whenever(pageSourceClient.getPageSource(originalUrl)).thenReturn(expectedNoWatermarkURL)

        val noWaterMarkPictureUrls = noWatermarkPictureService.getNoWaterMarkPictureBy(originalUrl)

        verify(pageSourceClient).getPageSource(originalUrl)
        assertThat(noWaterMarkPictureUrls).isEqualTo(listOf(expectedNoWatermarkURL))

    }
}