package com.dvag.urlaubsplaner

import java.sql.Date
import java.time.LocalDate
import java.time.temporal.ChronoUnit
import kotlin.math.sign

class Urlaubspruefer {

    fun isUrlaubValide(urlaubszeiten: ArrayList<LocalDate>, rolle: Rolle): Boolean {
        return isUrlaubsdauerValide(urlaubszeiten)&& isUrlaubszeitNichMehrfach(urlaubszeiten)
    }

    private fun isUrlaubsdauerValide(urlaubszeiten: ArrayList<LocalDate>): Boolean {
        var urlaubstage = 0;
        var zaehler = 0
            if(urlaubszeiten.size % 2 == 0){
                while(zaehler < urlaubszeiten.size){
                    zaehler +=2
                    var x = 0;
                    var y = 1;
                   urlaubstage +=
                    ChronoUnit.DAYS.between(urlaubszeiten[x], urlaubszeiten[y]).toInt()
                    x += 2;
                    y += 2;
                }
                return urlaubstage == 30
            }else{
                return false
            }
    }

    private fun isUrlaubFuerAzubisInFerien(urlaubszeiten: ArrayList<LocalDate>): Boolean {
        return true
    }

    private fun isUrlaubszeitNichMehrfach(urlaubszeiten: ArrayList<LocalDate>): Boolean {
        return true
    }

}