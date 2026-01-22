package com.paranid5.twin_peaks_tv_server
package di

import cats.data.Reader
import cats.effect.IO

type AppDependencies[F] = Reader[AppModule, F]

final class AppModule

object AppModule:
  def apply[T](launch: AppModule => IO[T]): IO[T] =
    launch(new AppModule())
