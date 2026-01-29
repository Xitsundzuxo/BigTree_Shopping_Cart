class TTSBridge(context: Context) {

    private val tts = TextToSpeech(context) {
        if (it == TextToSpeech.SUCCESS) {
            tts.language = Locale.US
        }
    }

    @JavascriptInterface
    fun speak(text: String) {
        tts.speak(text, TextToSpeech.QUEUE_FLUSH, null, "robot")
    }

    @JavascriptInterface
    fun stop() {
        tts.stop()
    }
}
