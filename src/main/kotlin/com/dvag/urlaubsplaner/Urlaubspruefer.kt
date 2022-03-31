package com.dvag.urlaubsplaner

import java.sql.Date

class Urlaubspruefer {

    fun isUrlaubValide(urlaubszeiten: ArrayList<Date?>?, rolle: Rolle?): Boolean {
        if(isUrlaubsdauerValide(urlaubszeiten)){


            if (rolle.toString().equals("AZUBI")){
                isUrlaubFuerAzubisInFerien(urlaubszeiten);
            }else{

            }

        }else {
            print("Ne")
        }

        return true
    }

    fun isUrlaubsdauerValide(urlaubszeiten: ArrayList<Date?>?): Boolean {
        return true
    }

    fun isUrlaubFuerAzubisInFerien(urlaubszeiten: ArrayList<Date?>?): Boolean {
        return true
    }

    fun isUrlaubszeitNichMehrfach(urlaubszeiten: ArrayList<Date?>?): Boolean {
        return true
    }

}