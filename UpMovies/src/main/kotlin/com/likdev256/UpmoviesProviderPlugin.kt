package com.likdev256

import com.lagradost.cloudstream3.plugins.CloudstreamPlugin
import com.lagradost.cloudstream3.plugins.Plugin
import android.content.Context
import com.lagradost.cloudstream3.extractors.StreamTape
import com.lagradost.cloudstream3.extractors.Streamplay
import com.lagradost.cloudstream3.extractors.Vidmoly

@CloudstreamPlugin
class UpmoviesProviderPlugin: Plugin() {
    override fun load(context: Context) {
        // All providers should be added in this manner. Please don't edit the providers list directly.
        registerMainAPI(UpmoviesProvider())
        registerMainAPI(Movierulz())
        registerExtractorAPI(EPlayExtractor())
        registerExtractorAPI(StreamWishExtractor())
        registerExtractorAPI(StreamWishExtractor())
        registerExtractorAPI(Filelion())
        registerExtractorAPI(DoodmainExtractor())
        registerExtractorAPI(DoodReExtractor())
        registerExtractorAPI(vtbe())
        registerExtractorAPI(StreamTape())
        registerExtractorAPI(Streamplay())
        registerExtractorAPI(Filemoon())
        registerExtractorAPI(StreamWishExtractor())
        registerExtractorAPI(Vidmoly())
    }
}
