package com.paranid5.twin_peaks_tv_server
package routing.movies

import cats.data.Reader
import cats.effect.IO
import cats.syntax.all.*

import com.paranid5.twin_peaks_tv_server.routing.AppRoutes

import org.http4s.HttpRoutes
import org.http4s.dsl.io.*
import org.http4s.server.middleware.CORS
import org.http4s.server.staticcontent.*

def moviesRoutes: AppRoutes =
  Reader: appModule =>
    val staticRoute = fileService[IO](FileService.Config("data/images"))

    CORS.policy.withAllowOriginAll:
      staticRoute <+> HttpRoutes.of[IO]:
        case GET -> (Root / "season1") =>
          onSeasonOne() run appModule

        case GET -> (Root / "season2") =>
          onSeasonTwo() run appModule

        case GET -> (Root / "season3") =>
          onSeasonThree() run appModule

        case GET -> (Root / "movie") =>
          onMovie() run appModule
