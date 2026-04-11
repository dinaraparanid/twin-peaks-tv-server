package com.paranid5.twin_peaks_tv_server
package routing.encyclopedia

import cats.effect.IO

import com.paranid5.twin_peaks_tv_server.routing.encyclopedia.entity.Character
import com.paranid5.twin_peaks_tv_server.routing.encyclopedia.response.allCharacters

import sttp.tapir.*
import sttp.tapir.json.circe.jsonBody
import sttp.tapir.generic.auto.*

private def characters = {
  val data = allCharacters

  endpoint.get
    .in("characters")
    .in(query[String]("query"))
    .out(jsonBody[List[Character]] example data)
    .serverLogic[IO]: query =>
      IO pure Right:
        query.trim.toLowerCase match {
          case ""         => data
          case queryLower => data filter (_.name.toLowerCase `contains` queryLower)
        }
}
