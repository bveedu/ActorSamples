import scala.actors._
// Demo of how receive maintains the stack.Actor exits when recieving a decimal value and 
// "Stop Acting" gets printed from stack
// Steps
//1) ReceiveActor.start
//2) ReceiveActor ! 10 
//3) ReceiveActor !  "Hello"
//4) ReceiveActor !  40.5
object ReceiveActor extends Actor {
def act() {
println("start Acting")
receive {
case msg : Int => 
println("received int : "+ msg)
act()
case msg : String => 
println("received String : "+ msg)
act()
case _ => 
println("received other: ")
}
println("Stop Acting")
}
}