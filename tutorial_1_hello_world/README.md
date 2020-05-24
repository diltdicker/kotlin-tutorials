# Hello World

## SDKMAN!

For Kotlin you will need to install [SDKMAN!](https://sdkman.io/install)

## Kotlin

Use SKDMAN! to install [Kotlin](https://kotlinlang.org/docs/tutorials/command-line.html)

```bash
sdk install kotlin
```

## HelloWorld.kt

Create a file HelloWorld.kt with the following code

```kotlin

fun main(args: Array<String>) {
    println("Hello World")
}

```

Compile it to a runnable jar with

```bash
kotlinc HelloWorld.kt -include-runtime -d helloworld.jar
```

Then run it with the command

```bash
java -jar helloworld.jar
```
