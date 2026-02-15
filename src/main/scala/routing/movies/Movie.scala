package com.paranid5.twin_peaks_tv_server
package routing.movies

import com.paranid5.twin_peaks_tv_server.routing.AppHttpResponse
import com.paranid5.twin_peaks_tv_server.routing.movies.response.movie

import cats.data.Reader

private def onMovie(): AppHttpResponse =
  Reader: appModule =>
    movie
