package com.dvag.urlaubsplaner

import java.time.LocalDate
import java.time.temporal.ChronoUnit

class Urlaubspruefer {

    fun isUrlaubValide(urlaubszeiten: MutableList<LocalDate>, rolle: Rolle): Boolean {
        return isUrlaubsdauerValide(urlaubszeiten)&& isUrlaubszeitNichMehrfach(urlaubszeiten)
    }

    private fun isUrlaubsdauerValide(urlaubszeiten: MutableList<LocalDate>): Boolean {
        var urlaubstage = 0
        var zaehler = 0
        var x = 0
        var y = 1
            if(urlaubszeiten.size % 2 == 0){
                while(zaehler < urlaubszeiten.size){
                    println(urlaubstage)
                    zaehler +=2
                   urlaubstage += ChronoUnit.DAYS.between(urlaubszeiten[x], urlaubszeiten[y]).toInt()
                    x += 2
                    y += 2
                    println(urlaubstage)
                }
                return urlaubstage == 30
            }else{
                return false
            }
    }

    private fun isUrlaubFuerAzubisInFerien(urlaubszeiten: MutableList<LocalDate>): Boolean {
        return true
    }

    private fun isUrlaubszeitNichMehrfach(urlaubszeiten: MutableList<LocalDate>): Boolean {
        return true
    }

}