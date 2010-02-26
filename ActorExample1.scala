import scala.actors._
// A demo of how actor works 
//Actor creates a separate thread of execution
object SimpleActor  {
def main(args: Array[String] ) {
val seriousActor2 = actor {
for (i <- 1 to 5){
println("I am in actor")
Thread.sleep(1000)
}
}
println("Started the actor")
for (i <-1 to 5)
println("I am out of Actor")
Thread.sleep(1000)
}
}
