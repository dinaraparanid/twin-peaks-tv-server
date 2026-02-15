package com.paranid5.twin_peaks_tv_server
package routing.movies

import routing.AppHttpResponse
import routing.movies.response.seasonThree

import cats.data.Reader

private def onSeasonThree(): AppHttpResponse =
  Reader: appModule =>
    seasonThree
