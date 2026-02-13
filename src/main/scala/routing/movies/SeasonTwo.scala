package com.paranid5.twin_peaks_tv_server
package routing.movies

import routing.AppHttpResponse
import routing.movies.response.seasonTwo

import cats.data.Reader

private def onSeasonTwo(): AppHttpResponse =
  Reader: appModule =>
    seasonTwo
