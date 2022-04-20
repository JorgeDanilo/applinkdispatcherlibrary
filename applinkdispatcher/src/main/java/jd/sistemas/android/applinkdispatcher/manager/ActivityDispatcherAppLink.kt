package jd.sistemas.android.applinkdispatcher.manager

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity

open class ActivityDispatcherAppLink : AppCompatActivity() {

    private var TAG = ActivityDispatcherAppLink::class.java.canonicalName

    private val mMapper by lazy {
        AppLinkManager(this)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        try {
            mMapper.dispatchIntent(intent)
        } catch (e: Exception) {
            Log.d(TAG, "Error $e")
        } finally {
            finish()
        }
    }
}