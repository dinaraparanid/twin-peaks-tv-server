package com.paranid5.twin_peaks_tv_server
package routing.movies

import cats.effect.IO

import com.paranid5.twin_peaks_tv_server.routing.movies.entity.Movie
import com.paranid5.twin_peaks_tv_server.routing.movies.response.movie

import sttp.tapir.*
import sttp.tapir.json.circe.jsonBody
import sttp.tapir.generic.auto.*

private def movieEndpoint = {
  val data = movie

  endpoint.get
    .in("movie")
    .out(jsonBody[Movie] example data)
    .serverLogic[IO]: _ =>
      IO pure Right(movie)
}
