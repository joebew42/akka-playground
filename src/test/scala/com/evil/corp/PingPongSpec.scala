package com.evil.corp

import akka.actor.ActorSystem
import akka.testkit.{ImplicitSender, TestKit}
import org.scalatest.FlatSpecLike

class PingPongSpec extends TestKit(ActorSystem("PingPongSpec")) with FlatSpecLike with ImplicitSender {

  it should "send back a pong when receive a ping" in {
    val pingActor = system.actorOf(PingActor.props)

    pingActor ! "ping"

    expectMsg("pong")
  }

}
