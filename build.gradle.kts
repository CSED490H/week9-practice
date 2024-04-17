plugins {
    java
}

group = "edu.postech.csed490h"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(platform("org.junit:junit-bom:5.9.1"))
    testImplementation("org.junit.jupiter:junit-jupiter")
    testRuntimeOnly("org.junit.platform:junit-platform-launcher")
}

tasks.test {
    useJUnitPlatform()
    // TODO: after each test, create jacoco test report
}

tasks.jacocoTestReport {
    reports {
        xml.required = false
        csv.required = false
        html.required = true
        // TODO: output report to "jacocoHtml"
    }
}