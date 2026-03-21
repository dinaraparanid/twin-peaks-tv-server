package com.paranid5.twin_peaks_tv_server
package routing.movies

import cats.effect.IO

import com.paranid5.twin_peaks_tv_server.routing.movies.entity.Season
import com.paranid5.twin_peaks_tv_server.routing.movies.response.seasonOne

import sttp.tapir.*
import sttp.tapir.json.circe.jsonBody
import sttp.tapir.generic.auto.*

private def seasonOneEndpoint = {
  val data = seasonOne

  endpoint.get
    .in("season1")
    .out(jsonBody[Season] example data)
    .serverLogic[IO]: _ =>
      IO pure Right(data)
}
