plugins {
    id("com.android.library")
    kotlin("android")
}

android {
    compileSdk = 31

    defaultConfig {
        minSdk = 21
        targetSdk = 31
    }

    buildFeatures.buildConfig = true
}

dependencies {
    testImplementation(project(":shared"))

    testImplementation("junit:junit:4.13.2")
}
