package jd.sistemas.android.applinkdispatcher.interfaces

import android.content.Intent
import jd.sistemas.android.applinkdispatcher.manager.ExecutableFlux

interface Flux {
    fun execute(link: ExecutableFlux?): Intent?
}