import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

group = "therealfarfetchd.ktag"
version = "1.0.0"

buildscript {
  var kotlin_version: String by extra
  kotlin_version = "1.2.+"

  repositories {
    mavenCentral()
  }

  dependencies {
    classpath(kotlinModule("gradle-plugin", kotlin_version))
  }
}

apply { from("publish.gradle.kts") }
apply { plugin("kotlin") }

val kotlin_version: String by extra

repositories {
  mavenCentral()
}

dependencies {
  compile(kotlinModule("stdlib-jdk8", kotlin_version))
}

tasks.withType<KotlinCompile> {
  kotlinOptions.jvmTarget = "1.8"
}