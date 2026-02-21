package com.paranid5.twin_peaks_tv_server

import cats.data.{Kleisli, Reader}
import cats.effect.{ExitCode, IO, IOApp}

import com.comcast.ip4s.{ipv4, port}

import com.paranid5.twin_peaks_tv_server.di.{AppDependencies, AppModule}
import com.paranid5.twin_peaks_tv_server.routing.movies.moviesRoutes

import org.http4s.ember.server.EmberServerBuilder
import org.http4s.server.Router
import org.http4s.server.staticcontent.{FileService, fileService}
import org.http4s.{Request, Response}

object App extends IOApp:
  override def run(args: List[String]): IO[ExitCode] =
    AppModule(runServer() run _)

  private def runServer(): AppDependencies[IO[ExitCode]] =
    Reader: appModule =>
      EmberServerBuilder
        .default[IO]
        .withHost(ipv4"0.0.0.0")
        .withPort(port"8080")
        .withHttpApp(appService run appModule)
        .build
        .use(_ => IO.never)
        .as(ExitCode.Success)

  private def appService: AppDependencies[Kleisli[IO, Request[IO], Response[IO]]] =
    for
      movies <- moviesRoutes
    yield Router(
      "/movies" -> movies,
    ).orNotFound

