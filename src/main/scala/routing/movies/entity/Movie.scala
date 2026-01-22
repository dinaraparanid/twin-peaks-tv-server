package com.paranid5.twin_peaks_tv_server
package routing.movies.entity

import io.circe.{Decoder, Encoder}

final case class Movie(
  title: String,
  year: Int,
  durationMinutes: Int,
  rating: Float,
  description: String,
  videoUrl: String,
  thumbnailUrls: List[String],
  scenesUrls: List[String],
  actors: List[Actor],
)

object Movie:
  private val FieldTitle = "title"
  private val FieldYear = "year"
  private val FieldDurationMinutes = "duration_minutes"
  private val FieldRating = "rating"
  private val FieldDescription = "description"
  private val FieldVideoUrl = "video_url"
  private val FieldThumbnailUrls = "thumbnail_urls"
  private val FieldScenesUrls = "scenes_urls"
  private val FieldActors = "actors"

  given Encoder[Movie] =
    Encoder.forProduct9(
      nameA0 = FieldTitle,
      nameA1 = FieldYear,
      nameA2 = FieldDurationMinutes,
      nameA3 = FieldRating,
      nameA4 = FieldDescription,
      nameA5 = FieldVideoUrl,
      nameA6 = FieldThumbnailUrls,
      nameA7 = FieldScenesUrls,
      nameA8 = FieldActors,
    )(m => (
      m.title,
      m.year,
      m.durationMinutes,
      m.rating,
      m.description,
      m.videoUrl,
      m.thumbnailUrls,
      m.scenesUrls,
      m.actors,
    ))

  given Decoder[Movie] =
    Decoder.forProduct9(
      nameA0 = FieldTitle,
      nameA1 = FieldYear,
      nameA2 = FieldDurationMinutes,
      nameA3 = FieldRating,
      nameA4 = FieldDescription,
      nameA5 = FieldVideoUrl,
      nameA6 = FieldThumbnailUrls,
      nameA7 = FieldScenesUrls,
      nameA8 = FieldActors,
    )(Movie.apply)
