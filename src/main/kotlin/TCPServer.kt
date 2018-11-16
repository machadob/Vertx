import io.vertx.core.Vertx

fun main(args: Array<String>) {
    var vertx = Vertx.vertx()
    var server = vertx.createNetServer()
    server.connectHandler({ socket ->
        socket.write("Hello Socket")// Handle the connection in here
    })
    server.listen(1234, "localhost", { res ->
        if (res.succeeded()) {
            println("Server is now listening!")
        } else {
            println("Failed to bind!")
        }
    })
}