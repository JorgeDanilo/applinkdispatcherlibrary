package jd.sistemas.android.applinkdispatcher.manager

import jd.sistemas.android.applinkdispatcher.flux.RegisterFlux
import jd.sistemas.android.applinkdispatcher.interfaces.Flux

enum class Uris(
    val path: String?,
    val flow: Flux
) {

    REGISTER_INITIAL("cadastro-candidato/app", RegisterFlux),
}