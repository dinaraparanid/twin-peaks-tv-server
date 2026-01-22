ThisBuild / version := "0.1.0-SNAPSHOT"

ThisBuild / scalaVersion := "3.8.1"

lazy val root = (project in file("."))
  .settings(
    name := "twin_peaks_tv_server",
    idePackagePrefix := Some("com.paranid5.twin_peaks_tv_server"),
    libraryDependencies ++= Seq(
      "org.typelevel"         %% "cats-effect"                   % "3.6.3",
      "org.http4s"            %% "http4s-dsl"                    % "0.23.33",
      "org.http4s"            %% "http4s-ember-server"           % "0.23.33",
      "org.http4s"            %% "http4s-circe"                  % "0.23.33",
      "io.circe"              %% "circe-generic"                 % "0.14.15",
      "io.circe"              %% "circe-literal"                 % "0.14.15",
    )
  )
