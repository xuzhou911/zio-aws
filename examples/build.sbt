
val commonSettings = Seq(
  scalaVersion := "2.13.2"
)

val zioAwsVersion = "1.13.69.1"

lazy val example1 = Project("example1", file("example1")).settings(commonSettings).settings(
  libraryDependencies ++= Seq(
    "io.github.vigoo" %% "zio-aws-core" % zioAwsVersion,
    "io.github.vigoo" %% "zio-aws-http4s" % zioAwsVersion,
    "io.github.vigoo" %% "zio-aws-netty" % zioAwsVersion,
    "io.github.vigoo" %% "zio-aws-elasticbeanstalk" % zioAwsVersion,
    "io.github.vigoo" %% "zio-aws-ec2" % zioAwsVersion,
    "org.typelevel"   %% "cats-effect" % "2.1.4"
  )
)