package com.paranid5.twin_peaks_tv_server
package routing

import com.paranid5.twin_peaks_tv_server.di.AppDependencies

import cats.effect.IO
import org.http4s.{HttpRoutes, Response}

private type AppRoutes = AppDependencies[HttpRoutes[IO]]
private type AppHttpResponse = AppDependencies[IO[Response[IO]]]
