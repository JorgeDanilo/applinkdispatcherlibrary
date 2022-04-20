package jd.sistemas.android.applinkdispatcher.manager

import android.content.Context
import android.content.Intent
import android.content.UriMatcher
import jd.sistemas.android.applinkdispatcher.interfaces.AppLink

class AppLinkManager(context: Context): AppLink {

    private var context: Context? = null
    private var mUriMatcher: UriMatcher

    init {
        this.context = context
        this.mUriMatcher = UriMatcher(UriMatcher.NO_MATCH)
        for (uri in Uris.values()) mUriMatcher.addURI(AUTHORITY, uri.path, uri.ordinal)
    }

    override fun dispatchIntent(intent: Intent) {
        val uri = intent.data
        val code = mUriMatcher.match(uri)
        val uris = Uris.values()[code]
        executableFlux(uris)
    }

    private fun executableFlux(uris: Uris) {
        uris.flow.let { ExecutableFlux(it).executeFlux() }.let {
            context?.startActivity(Intent(context?.applicationContext, LibraryActivity::class.java))
        }
    }


    companion object {
        private const val AUTHORITY = "*"
    }
}
