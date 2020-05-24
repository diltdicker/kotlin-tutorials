package tutorial

import io.javalin.Javalin
import io.javalin.apibuilder.ApiBuilder.*

fun main(args: Array<String>) {
    val app = Javalin.create().start(7000)

    app.routes {

        get("/") { ctx ->
            ctx.result("Hello World") 
        }
    }
}