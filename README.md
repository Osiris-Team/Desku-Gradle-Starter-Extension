# Desku-Gradle-Starter-Extension [![](https://jitpack.io/v/Osiris-Team/Desku-Gradle-Starter-Extension.svg)](https://jitpack.io/#Osiris-Team/Desku-Gradle-Starter-Extension)
Example starter [Desku](https://github.com/Osiris-Team/Desku) extension, built with Gradle.

[Click here for Maven/Gradle/Sbt/Leinigen instructions](https://jitpack.io/#Osiris-Team/Desku-Gradle-Starter-Extension/LATEST) (Java 11 or higher required).

`>>> Supports Desku 1.0.0 or higher!`

#### Contains
- Preferred directory structure.
- Usage examples of important methods.
- `build.gradle` file that includes files other than .java source code.
- Effortless publishing via Jitpack (simply update your author/repo-name in this readme).

#### Important
Optimally your extension only uses the **App, UI and Component**
classes from the Desku library, to ensure it's compatible with newer versions of Desku, and thus 
does not require future maintenance by you when updates are released.

If you think your extension is a mainstream component, or tries to enhance
an existing Desku component, feel free to create
an PR and integrate it directly into Desku.
