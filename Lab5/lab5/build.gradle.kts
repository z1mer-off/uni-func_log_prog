plugins {
    kotlin("jvm") version "1.9.23" // Убедитесь, что версия соответствует версии Kotlin, которую вы используете
}

repositories {
    mavenCentral()
}

dependencies {
    implementation(kotlin("stdlib"))
    testImplementation(kotlin("test"))
    testImplementation("org.junit.jupiter:junit-jupiter-api:5.10.0") // Убедитесь, что используете одну из последних версий
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine:5.10.0")
}

tasks.test {
    useJUnitPlatform()
}
