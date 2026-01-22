package com.paranid5.twin_peaks_tv_server
package routing.movies.entity

import io.circe.{Decoder, Encoder}

final case class Episode(
  title: String,
  rating: Float,
  description: String,
  thumbnailUrl: String,
  videoUrl: String,
)

object Episode:
  private val FieldTitle = "title"
  private val FieldRating = "rating"
  private val FieldDescription = "description"
  private val FieldThumbnailUrl = "thumbnail_url"
  private val FieldVideoUrl = "video_url"

  given Encoder[Episode] =
    Encoder.forProduct5(
      nameA0 = FieldTitle,
      nameA1 = FieldRating,
      nameA2 = FieldDescription,
      nameA3 = FieldThumbnailUrl,
      nameA4 = FieldVideoUrl,
    )(e => (e.title, e.rating, e.description, e.thumbnailUrl, e.videoUrl))

  given Decoder[Episode] = Decoder.forProduct5(
    nameA0 = FieldTitle,
    nameA1 = FieldRating,
    nameA2 = FieldDescription,
    nameA3 = FieldThumbnailUrl,
    nameA4 = FieldVideoUrl,
  )(Episode.apply)
