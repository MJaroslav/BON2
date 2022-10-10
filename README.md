# BON2

A fork of Immibis's bearded-octo-nemesis from another fork by [FIXxp/BON2](https://github.com/FIXxp/BON2).

[![GitHub issues](https://img.shields.io/github/issues/MJaroslav/BON2)](https://github.com/MJaroslav/BON2/issues "GitHub issues")
[![GitHub forks](https://img.shields.io/github/forks/MJaroslav/BON2)](https://github.com/MJaroslav/BON2/network "GitHub forks")
[![GitHub stars](https://img.shields.io/github/stars/MJaroslav/BON2)](https://github.com/MJaroslav/BON2/stargazers "GitHub stars")
[![GitHub license](https://img.shields.io/github/license/MJaroslav/BON2)](https://github.com/MJaroslav/BON2/blob/master/LICENSE "Open license")
[![JitPack](https://jitpack.io/v/MJaroslav/BON2.svg)](https://jitpack.io/#MJaroslav/BON2 "JitPack")
[![JitCI status](https://jitci.com/gh/MJaroslav/BON2/svg)](https://jitci.com/gh/MJaroslav/BON2 "JitCI")
![GitHub CI test status](https://github.com/MJaroslav/BON2/actions/workflows/ci-test.yml/badge.svg)

## Fork changes

- Gradle wrapper version bumped from `5.6.4` to `7.5.1`
- Using of [this](https://gist.github.com/dedunumax/54e82214715e35439227) `.gitignore`
- Group and packaged changed to `io.github.mjaroslav` for avoiding conflicts (this fork not for pull requests to main)
- `build.gradle` redacted:
    - Uses [shadow](https://github.com/johnrengelman/shadow) plugin instead of `fatJar` (with `all` classifier)
    - Configured maven-publish plugin (uses `jar`, `sourceJar` and `shadowJar` artifacts)
    - `jar` now not used `bin` classifier
    - Version hardcoded and will be bumped manually
- Added configuration for [jitpack.io](https://jitpack.io)
- Added application exit shortcut: <kdb>Ctrl</kdb> + <kdb>Q</kdb>
- Replaced GitHub action file for just testing

## Usage as library

Add JitPack to your repositories:

```groovy
repositories {
    maven {
        name 'JitPack'
        url 'https://jitpack.io/
    }
    mavenCentral() // If libraries can't be resolved
}
```

And add BON2 to dependencies:

```groovy
dependencies {
    implementation 'com.github.MJaroslav:BON2:master-SNAPSHOT'
     // master-SNAPSHOT is a latest commit version, but you can use version from GitHub Releases
}
```

## Building

Just clone repository, checkout to this branch and run `./gradlew build`.

## Post Scriptum

Feel free to correct typos and errors in the text or code :)
