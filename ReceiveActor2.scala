import scala.actors._
// Demo of receive controlled by a while loop.Actor exits when recieving a decimal value and 
// "Stop Acting" gets printed 
// cannot use actor loop since it has no way to exit
// Steps
//1) ReceiveActor2.start
//2) ReceiveActor2 ! 10 
//3) ReceiveActor2 !  "Hello"
//4) ReceiveActor2 !  40.5
object ReceiveActor2 extends Actor {
def act() {
println("start Acting")
var continue = true
while(continue){
receive {
case msg : Int => 
println("received int : "+ msg)
case msg : String => 
println("received String : "+ msg)
case _ => 
println("received other: ")
continue = false
}
}
println("Stop Acting")
}
}