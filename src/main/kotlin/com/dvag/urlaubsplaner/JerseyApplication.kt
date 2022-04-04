package com.dvag.urlaubsplaner

import jakarta.ws.rs.core.Application
class JerseyApplication: Application() {
    override fun getSingletons(): MutableSet<Any> {
        return mutableSetOf(UrlaubsplanerResource())
    }
}