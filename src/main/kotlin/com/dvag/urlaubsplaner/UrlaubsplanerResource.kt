package com.dvag.urlaubsplaner

import jakarta.ws.rs.POST
import jakarta.ws.rs.Path
import jakarta.ws.rs.Produces
import jakarta.ws.rs.container.ContainerRequestContext
import jakarta.ws.rs.container.ContainerResponseContext
import jakarta.ws.rs.container.ContainerResponseFilter
import jakarta.ws.rs.core.MediaType
import jakarta.ws.rs.ext.Provider
import java.io.IOException
import java.time.LocalDate


@Path("")
@Provider
class UrlaubsplanerResource : ContainerResponseFilter {

    @POST
    @Produces(MediaType.APPLICATION_JSON)
    fun postBerechneGesundheitswerte(urlaubsdaten: ArrayList<LocalDate>,rolle: String) {
        val urlaubspruefer = Urlaubspruefer()
        if(urlaubspruefer.isUrlaubValide(urlaubsdaten, mapRolle(rolle))){
            Jahresurlaub(urlaubsdaten)
        }
    }

    fun mapRolle(rolle: String): Rolle{
        return Rolle.valueOf(rolle)
    }

    @Throws(IOException::class)
    override fun filter(
        requestContext: ContainerRequestContext?,
        containerResponseContext: ContainerResponseContext
    ) {
        containerResponseContext.headers.add("Access-Control-Allow-Origin", "*")
        containerResponseContext.headers.add(
            "Access-Control-Allow-Headers",
            "origin, content-type, accept, authorization"
        )
        containerResponseContext.headers.add("Access-Control-Allow-Credentials", "true")
        containerResponseContext.headers.add("Access-Control-Allow-Methods", "GET, POST, PUT, DELETE, OPTIONS, HEAD")
        containerResponseContext.headers.add("Access-Control-Max-Age", "1209600")
    }

}