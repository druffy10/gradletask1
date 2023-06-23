plugins {
    id("java")
}

group = "ru.netology.maventask"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation ("testImplementation 'junit:junit:4.13'")
    testImplementation("junit:junit:4.13.1")
}

tasks.test {
    useJUnit()
}