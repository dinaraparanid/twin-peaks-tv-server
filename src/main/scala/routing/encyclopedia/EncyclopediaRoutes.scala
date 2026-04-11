package com.paranid5.twin_peaks_tv_server
package routing.encyclopedia

import cats.data.Reader
import cats.effect.IO
import cats.syntax.all.*

import com.paranid5.twin_peaks_tv_server.routing.AppRoutes
import com.paranid5.twin_peaks_tv_server.routing.docs.docsRoutes

import org.http4s.server.middleware.CORS

import sttp.tapir.server.http4s.Http4sServerInterpreter

def encyclopediaRoutes: AppRoutes =
  Reader: appModule =>
    val encyclopediaEndpoints = List(characters)
    val encyclopediaRoutes = Http4sServerInterpreter[IO]().toRoutes(encyclopediaEndpoints)
    val swaggerRoutes = docsRoutes(encyclopediaEndpoints)

    CORS.policy.withAllowOriginAll:
      encyclopediaRoutes <+> swaggerRoutes
