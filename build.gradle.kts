plugins {
    id("java")
}

group = "ru.alfabank"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(platform("org.junit:junit-bom:5.10.0"))
    testImplementation("org.junit.jupiter:junit-jupiter")
    // Source: https://mvnrepository.com/artifact/net.datafaker/datafaker
    implementation("net.datafaker:datafaker:2.5.4")
    // Source: https://mvnrepository.com/artifact/com.github.lalyos/jfiglet
    implementation("com.github.lalyos:jfiglet:0.0.8")
}

tasks.test {
    useJUnitPlatform()
}

// ==================== Кодировка UTF-8 ====================

// Для компиляции
tasks.withType<JavaCompile>().configureEach {
    options.encoding = "UTF-8"
}

// Для запуска через ./gradlew run
tasks.withType<JavaExec>().configureEach {
    systemProperty("file.encoding", "UTF-8")
    systemProperty("console.encoding", "UTF-8")
    systemProperty("stdout.encoding", "UTF-8")
}