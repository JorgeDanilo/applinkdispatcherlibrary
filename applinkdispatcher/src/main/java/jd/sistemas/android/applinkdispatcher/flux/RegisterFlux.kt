package jd.sistemas.android.applinkdispatcher.flux

import android.content.Intent
import android.util.Log
import jd.sistemas.android.applinkdispatcher.manager.ExecutableFlux
import jd.sistemas.android.applinkdispatcher.interfaces.Flux

object RegisterFlux : Flux {

    override fun execute(link: ExecutableFlux?): Intent {
        Log.d("Register Flux", "Flux $link")
        return Intent()
    }

}

