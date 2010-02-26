import scala.actors.Actor._
// Accessing the Actor related to current thread
// Sending and recieving message to self (Current thread) 

 self ! "Hello world to self"
 self.receive { case x => println("Recieved self :"+x) }