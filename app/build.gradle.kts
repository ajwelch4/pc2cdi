plugins {
    application
}

repositories {
    mavenCentral()
}

dependencies {
    implementation(platform("com.google.cloud:libraries-bom:26.41.0"))

    implementation("com.google.cloud:google-cloud-bigquerymigration")
}

application {
    mainClass.set("pc2cdi.App")
}
