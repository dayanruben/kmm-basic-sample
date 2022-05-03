plugins {
    id("com.android.application")
    kotlin("multiplatform")
}

android {
    compileSdk = 31
    defaultConfig {
        applicationId = "com.jetbrains.androidApp"
        minSdk = 21
        targetSdk = 31
        versionCode = 1
        versionName = "1.0"
    }
    buildTypes {
        getByName("release") {
            isMinifyEnabled = false
        }
    }
}

kotlin {
    android()
    sourceSets {
        val androidMain by getting {
            dependencies {
                implementation(project(":shared"))
                implementation("com.google.android.material:material:1.5.0")
                implementation("androidx.appcompat:appcompat:1.4.1")
                implementation("androidx.constraintlayout:constraintlayout:2.1.3")
            }
        }
    }
}
