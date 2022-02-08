package akkaBasic

import akka.actor.ActorRef
import akka.actor.ActorSystem

object AkkaFirstProgMain extends App {

  val system: ActorSystem = ActorSystem("Kevin")

  val k: ActorRef = system.actorOf(AkkaFirstProg.props, "Akka")

  k ! "KevinManu"
  k ! "Ajith"
  k ! 88

//  system.terminate()


}
