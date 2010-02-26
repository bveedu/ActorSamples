import scala.actors._
// Use of react without loop ,but by calling act() again .Exits when recieving a decimal value
// but since we use react "Stop Acting" will never gets printed as react never returns
// Steps
//1) ReactActor.start
//2) ReactActor ! 10 
//3) ReactActor !  "Hello"
object ReactActor2 extends Actor {
def act() {
println("start Acting")
react {
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