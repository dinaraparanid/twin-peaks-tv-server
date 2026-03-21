package com.paranid5.twin_peaks_tv_server
package routing.movies

import cats.effect.IO

import com.paranid5.twin_peaks_tv_server.routing.movies.entity.Season
import com.paranid5.twin_peaks_tv_server.routing.movies.response.seasonTwo

import sttp.tapir.*
import sttp.tapir.json.circe.jsonBody
import sttp.tapir.generic.auto.*

private def seasonTwoEndpoint = {
  val data = seasonTwo

  endpoint.get
    .in("season2")
    .out(jsonBody[Season] example data)
    .serverLogic[IO]: _ =>
      IO pure Right(data)
}
