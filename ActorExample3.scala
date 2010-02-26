import scala.actors._
// Use of react.This actor wait in a loop to receive mutiple messages.
// but since we use react "Stop Acting" will never gets printed as react never returns
// Steps
//1) ReactActor.start
//2) ReactActor ! 10 
//3) ReactActor !  "Hello"
object ReactActor extends Actor {
def act() {
println("start Acting")
loop {
react {
case msg : Int => 
println("received int : "+ msg)
case msg : String => 
println("received String : "+ msg)
case _ => 
println("received other: ")
}
}
println("Stop Acting")
}
}