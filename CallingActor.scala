import scala.actors._
// A demo of how actor works 
//Actor creates a separate thread of execution
object CallingActor  {
def main(args: Array[String] ) {
println("Calling ResponseActor the actor")
ResponseActor.start
ResponseActor ! "Hello ResponseActor"
println("Comming out")
}
}
