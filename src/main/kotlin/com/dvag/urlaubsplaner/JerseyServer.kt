package com.dvag.urlaubsplaner

import org.glassfish.jersey.netty.httpserver.NettyHttpContainerProvider
import org.glassfish.jersey.server.ResourceConfig
import java.net.URI

object JerseyServer {
    @JvmStatic
    fun main(args: Array<String>) {
        val resourceConfig = ResourceConfig.forApplication(JerseyApplication())
        val server = NettyHttpContainerProvider.createHttp2Server(URI.create("http://localhost:8088/"), resourceConfig, null)
        Runtime.getRuntime().addShutdownHook(Thread(Runnable { server.close() }))
    }
}