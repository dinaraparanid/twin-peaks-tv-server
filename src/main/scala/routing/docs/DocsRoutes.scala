package com.paranid5.twin_peaks_tv_server
package routing.docs

import cats.effect.IO

import org.http4s.server.middleware.CORS

import sttp.tapir.server.ServerEndpoint
import sttp.tapir.server.http4s.Http4sServerInterpreter
import sttp.tapir.swagger.bundle.SwaggerInterpreter

def docsRoutes(endpoints: List[ServerEndpoint[?, IO]]) =
  CORS.policy.withAllowOriginAll:
    val swaggerEndpoints = SwaggerInterpreter()
      .fromServerEndpoints[IO](endpoints = endpoints, title = "Twin Peaks TV Server", version = "1.0.0")

    Http4sServerInterpreter().toRoutes(swaggerEndpoints)