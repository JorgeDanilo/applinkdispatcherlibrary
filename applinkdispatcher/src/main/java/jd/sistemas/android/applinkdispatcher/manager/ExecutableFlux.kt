package jd.sistemas.android.applinkdispatcher.manager

import android.content.Intent
import jd.sistemas.android.applinkdispatcher.interfaces.Flux

class ExecutableFlux(private val flux: Flux) {

    fun executeFlux(): Intent? {
        return flux.execute(this)
    }
}
