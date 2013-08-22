package org.wasabi.routing

import io.netty.handler.codec.http.HttpMethod

public trait RouteLocator {
    fun findRouteHandlers(path: String, method: HttpMethod): Route
    fun compareRouteSegments(route1: Route, path: String): Boolean
}