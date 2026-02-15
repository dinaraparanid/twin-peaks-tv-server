package com.paranid5.twin_peaks_tv_server
package routing.movies

import com.paranid5.twin_peaks_tv_server.routing.AppHttpResponse
import com.paranid5.twin_peaks_tv_server.routing.movies.response.seasonTwo

import cats.data.Reader

private def onSeasonTwo(): AppHttpResponse =
  Reader: appModule =>
    seasonTwo
