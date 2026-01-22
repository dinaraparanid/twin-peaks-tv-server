package com.paranid5.twin_peaks_tv_server
package routing.movies.entity

import io.circe.{Decoder, Encoder}

final case class Actor(
  name: String,
  character: String,
  thumbnailUrl: String,
)

object Actor:
  private val FieldName = "name"
  private val FieldCharacter = "character"
  private val FieldThumbnailUrl = "thumbnail_url"

  given Encoder[Actor] =
    Encoder.forProduct3(
      nameA0 = FieldName,
      nameA1 = FieldCharacter,
      nameA2 = FieldThumbnailUrl,
    )(a => (a.name, a.character, a.thumbnailUrl))

  given Decoder[Actor] =
    Decoder.forProduct3(
      nameA0 = FieldName,
      nameA1 = FieldCharacter,
      nameA2 = FieldThumbnailUrl,
    )(Actor.apply)
