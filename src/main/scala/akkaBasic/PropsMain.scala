package akkaBasic

import akka.actor.SupervisorStrategy.Stop
import akka.actor.{ActorRef, ActorSystem, Kill, PoisonPill}

object PropsMain extends App {

  val a = ActorSystem("MyAkka")

  val b: ActorRef = a.actorOf(PropsPurpose.props2, "Kevin")
  b ! "End"
  b ! "End"


//  b ! PoisonPill //DeadLetters
  //  b ! Kill
  //  a.stop(b)

  b ! "End"

  b ! "Hi"

  //  a.terminate()


}
