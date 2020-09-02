// Top-level build file where you can add configuration options common to all sub-projects/modules.
buildscript {
    val kotlinVersion by extra ("1.3.72")
    repositories {
        google()
        jcenter()
        maven (url = "https://plugins.gradle.org/m2/")
    }
    dependencies {
        classpath ("com.android.tools.build:gradle:4.0.0")
//        classpath ("com.google.gms:google-services:4.3.3")
        classpath(kotlin("gradle-plugin", version = kotlinVersion))


        // NOTE: Do not place your application dependencies here; they belong
        // in the individual module build.gradle files
    }
}

allprojects {
    repositories {
        google()
        jcenter()
        mavenCentral()
        maven (url = "https://jitpack.io")
    }
    gradle.projectsEvaluated {
        tasks.withType<JavaCompile> {
            options.compilerArgs.add("-Xlint:unchecked")
            options.compilerArgs.add("-Xlint:deprecation")
        }
    }
}

tasks.create("clean", type = Delete::class) {
    delete (rootProject.buildDir)
}
