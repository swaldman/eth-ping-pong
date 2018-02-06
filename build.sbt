name := "eth-ping-pong"

organization := "com.mchange"

version := "0.0.1-SNAPSHOT"

scalaVersion := "2.12.4"

scalacOptions ++= Seq("-unchecked", "-deprecation")

resolvers += ("releases" at "https://oss.sonatype.org/service/local/staging/deploy/maven2")

resolvers += ("snapshots" at "https://oss.sonatype.org/content/repositories/snapshots")

resolvers += ("Typesafe repository" at "http://repo.typesafe.com/typesafe/releases/")

ethcfgScalaStubsPackage := "com.mchange.ethpingpong.contract"

