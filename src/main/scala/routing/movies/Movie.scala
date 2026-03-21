package com.paranid5.twin_peaks_tv_server
package routing.movies

import cats.effect.IO
import cats.data.Reader

import com.paranid5.twin_peaks_tv_server.routing.AppHttpResponse
import com.paranid5.twin_peaks_tv_server.routing.movies.response.movie

import sttp.tapir.*

private def movieEndpoint =
  endpoint.get
    .in("movie")
    .out(stringJsonBody)
    .serverLogic[IO]: _ =>
      IO pure Right(movie.toString)
