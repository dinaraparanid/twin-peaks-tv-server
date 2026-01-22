package com.paranid5.twin_peaks_tv_server
package routing.movies.entity

import io.circe.{Decoder, Encoder}

final case class Season(
  title: String,
  year: Int,
  rating: Float,
  description: String,
  thumbnailUrls: List[String],
  episodes: List[Episode],
  actors: List[Actor],
)

object Season:
  private val FieldTitle = "title"
  private val FieldYear = "year"
  private val FieldRating = "rating"
  private val FieldDescription = "description"
  private val FieldThumbnailUrls = "thumbnail_urls"
  private val FieldEpisodes = "episodes"
  private val FieldActors = "actors"

  given Encoder[Season] =
    Encoder.forProduct7(
      nameA0 = FieldTitle,
      nameA1 = FieldYear,
      nameA2 = FieldRating,
      nameA3 = FieldDescription,
      nameA4 = FieldThumbnailUrls,
      nameA5 = FieldEpisodes,
      nameA6 = FieldActors,
    )(s => (s.title, s.year, s.rating, s.description, s.thumbnailUrls, s.episodes, s.actors))

  given Decoder[Season] =
    Decoder.forProduct7(
      nameA0 = FieldTitle,
      nameA1 = FieldYear,
      nameA2 = FieldRating,
      nameA3 = FieldDescription,
      nameA4 = FieldThumbnailUrls,
      nameA5 = FieldEpisodes,
      nameA6 = FieldActors,
    )(Season.apply)
