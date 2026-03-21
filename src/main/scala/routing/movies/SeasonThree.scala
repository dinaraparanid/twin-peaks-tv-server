package com.paranid5.twin_peaks_tv_server
package routing.movies

import cats.effect.IO

import com.paranid5.twin_peaks_tv_server.routing.movies.entity.Season
import com.paranid5.twin_peaks_tv_server.routing.movies.response.seasonThree

import sttp.tapir.*
import sttp.tapir.json.circe.jsonBody
import sttp.tapir.generic.auto.*

private def seasonThreeEndpoint = {
  val data = seasonThree

  endpoint.get
    .in("season3")
    .out(jsonBody[Season] example data)
    .serverLogic[IO]: _ =>
      IO pure Right(data)
}
