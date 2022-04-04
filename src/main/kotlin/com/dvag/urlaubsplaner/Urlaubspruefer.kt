package com.dvag.urlaubsplaner

import java.time.temporal.ChronoUnit

class Urlaubspruefer {

    fun isUrlaubValide(urlaubszeiten: MutableList<Jahresurlaub>, rolle: Rolle): Boolean {
        return isUrlaubsdauerValide(urlaubszeiten) && isUrlaubszeitNichMehrfach(urlaubszeiten)
    }

    private fun isUrlaubsdauerValide(urlaubszeiten: MutableList<Jahresurlaub>): Boolean {
        var urlaubstage = 0
        var schleifendurchlaufsZaehler = 0
        for (jahresurlaubObjekt in urlaubszeiten) {
            urlaubstage += (ChronoUnit.DAYS.between(
                urlaubszeiten[schleifendurchlaufsZaehler].anfangsdatum,
                urlaubszeiten[schleifendurchlaufsZaehler].enddatum
            ).toInt() + 1)
            schleifendurchlaufsZaehler++
        }
        return urlaubstage == 30
    }

    //TODO
    private fun isUrlaubFuerAzubisInFerien(urlaubszeiten: MutableList<Jahresurlaub>): Boolean {
        return true
    }
    //TODO
    private fun isUrlaubszeitNichMehrfach(urlaubszeiten: MutableList<Jahresurlaub>): Boolean {
        return true
    }
}