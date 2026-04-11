package com.paranid5.twin_peaks_tv_server
package routing.encyclopedia.entity

import io.circe.{Decoder, Encoder}

final case class Character(
  name: String,
  info: String,
  thumbnailUrl: String,
)

object Character:
  private val FieldName = "name"
  private val FieldInfo = "info"
  private val FieldThumbnailUrl = "thumbnail_url"

  given Encoder[Character] =
    Encoder.forProduct3(
      nameA0 = FieldName,
      nameA1 = FieldInfo,
      nameA2 = FieldThumbnailUrl,
    )(a => (a.name, a.info, a.thumbnailUrl))

  given Decoder[Character] =
    Decoder.forProduct3(
      nameA0 = FieldName,
      nameA1 = FieldInfo,
      nameA2 = FieldThumbnailUrl,
    )(Character.apply)
