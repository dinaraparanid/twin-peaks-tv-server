package com.paranid5.twin_peaks_tv_server
package routing.movies

import cats.data.Reader

import com.paranid5.twin_peaks_tv_server.routing.AppHttpResponse
import com.paranid5.twin_peaks_tv_server.routing.movies.response.seasonOne

private def onSeasonOne(): AppHttpResponse =
  Reader: appModule =>
    seasonOne
