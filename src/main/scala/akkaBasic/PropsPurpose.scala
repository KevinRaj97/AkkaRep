package akkaBasic

import akka.actor.{Actor, Props}

class PropsPurpose(name: String) extends Actor {

  def receive: Receive = {
    case msg => child ! msg
    case this.name => println("Message from " + name)
    case _ => println("No message passed")
  }

  val child = context.actorOf(Props(new Bchild),"ak")
}

class Bchild extends Actor {
  override def receive = {
    case sm => println("Child " + sm + self.path.name)
  }
}


object PropsPurpose {

  //Types of Props
  //  val props = Props(new PropsPurpose("kevin"))

  //      val props1 = Props[PropsPurpose]()

  val props2 = Props(classOf[PropsPurpose], "arg")
}
