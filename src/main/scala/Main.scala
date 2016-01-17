import com.twitter.finagle.Http
import io.finch._

object Main extends App {

  val api: Endpoint[String] = get("hello") {
    Ok("Hello, World!!!")
  }

  Http.serve(":8081", api.toService)

}

