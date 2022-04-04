package com.dvag.urlaubsplaner

import java.time.temporal.ChronoUnit

class Urlaubspruefer {

    fun isUrlaubValide(urlaubszeiten: MutableList<Jahresurlaub>, rolle: Rolle): Boolean {
        return isUrlaubsdauerValide(urlaubszeiten) && isUrlaubszeitNichMehrfach(urlaubszeiten)
    }

    private fun isUrlaubsdauerValide(urlaubszeiten: MutableList<Jahresurlaub>): Boolean {
        var urlaubstage = 0
        var zaehler = 0
        for (eintraege in urlaubszeiten) {
            println(urlaubstage)
            urlaubstage += (ChronoUnit.DAYS.between(urlaubszeiten[zaehler].anfangsdatum, urlaubszeiten[zaehler].enddatum).toInt()+1)
            println(urlaubstage)
            zaehler++
        }
        return urlaubstage == 30
    }

private fun isUrlaubFuerAzubisInFerien(urlaubszeiten: MutableList<Jahresurlaub>): Boolean {
    return true
}

private fun isUrlaubszeitNichMehrfach(urlaubszeiten: MutableList<Jahresurlaub>): Boolean {
    return true
}
}