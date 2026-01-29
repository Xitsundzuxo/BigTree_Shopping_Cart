webView.settings.javaScriptEnabled = true
webView.addJavascriptInterface(TTSBridge(this), "AndroidTTS")
