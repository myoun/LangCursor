package com.github.lauvsong.langcursor

import com.github.lauvsong.langcursor.services.LanguageCheckService
import com.intellij.ide.AppLifecycleListener

class IdeLifeCycleListener : AppLifecycleListener {

    override fun appStarted() {
        super.appStarted()
        LanguageCheckService.start()
    }

    override fun appClosing() {
        super.appClosing()
        LanguageCheckService.shutdown()
    }
}