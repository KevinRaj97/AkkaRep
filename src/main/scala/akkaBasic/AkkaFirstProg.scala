package akkaBasic

import akka.actor.{Actor, ActorLogging, Props}

class AkkaFirstProg extends Actor {
  override def receive: Receive = {
    case masg => println(masg)
  }
}

object AkkaFirstProg {
  def props: Props = Props(new AkkaFirstProg) //props --ActorInstance
}
