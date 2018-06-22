
name := "akka-bootstrap"

version := "0.14.0"

scalaVersion := "2.12.6"

scalaVersion := "2.12.4"

def akkaManagementVersion(version: String) = version.split('+')(0)

libraryDependencies += "com.lightbend.akka.management" %% "akka-management-cluster-bootstrap" % akkaManagementVersion(version.value)

libraryDependencies += "com.lightbend.akka.management" %% "akka-management-cluster-http" % akkaManagementVersion(version.value)

libraryDependencies += "com.lightbend.akka.discovery" %% "akka-discovery-kubernetes-api" % "0.14.0"

libraryDependencies += "com.lightbend.akka.discovery" %% "akka-discovery-dns" % "0.14.0"

