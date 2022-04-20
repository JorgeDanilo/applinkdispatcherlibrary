package jd.sistemas.android.applinkdispatcher.interfaces

import android.content.Intent

sealed interface AppLink {
    fun dispatchIntent(intent: Intent)
}