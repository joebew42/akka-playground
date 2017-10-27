package com.evil.corp

import akka.actor.{Actor, Props}

object PingActor {
  def props: Props = Props(new PingActor())
}

class PingActor extends Actor {
  override def receive = {
    case "ping" => sender() ! "pong"
  }
}
