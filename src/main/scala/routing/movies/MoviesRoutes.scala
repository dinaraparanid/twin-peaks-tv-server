package com.paranid5.twin_peaks_tv_server
package routing.movies

import cats.data.Reader
import cats.effect.IO
import cats.syntax.all.*

import com.paranid5.twin_peaks_tv_server.routing.AppRoutes
import com.paranid5.twin_peaks_tv_server.routing.docs.docsRoutes

import org.http4s.server.middleware.CORS
import org.http4s.server.staticcontent.*

import sttp.tapir.server.http4s.Http4sServerInterpreter
import sttp.tapir.swagger.bundle.SwaggerInterpreter

def moviesRoutes: AppRoutes =
  Reader: appModule =>
    val staticRoute = fileService[IO](FileService.Config("data/images"))
    val moviesEndpoints = List(seasonOneEndpoint, seasonTwoEndpoint, seasonThreeEndpoint, movieEndpoint)
    val moviesRoutes = Http4sServerInterpreter[IO]().toRoutes(moviesEndpoints)
    val swaggerRoutes = docsRoutes(moviesEndpoints)

    CORS.policy.withAllowOriginAll:
      staticRoute <+> moviesRoutes <+> swaggerRoutes
