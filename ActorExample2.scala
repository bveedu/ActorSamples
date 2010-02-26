import scala.actors._
// A demo of how actor with recieve block and loop with pattern matching.
// This actor wait in a loop to recive mutiple messages. Without loop actor exits after handling first message
// Steps
//1) BetterActor.start
//2) BetterActor ! 10 
//3) BetterActor !  "Hello"
object BetterActor extends Actor {
def act() {
loop{
receive {
case msg : Int =>
println("received int : "+ msg)
case msg : String =>
println("received String : "+ msg)
case _ =>
println("received other: ")
}
}
}
}