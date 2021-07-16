package com.example

import com.example.data.Room
import com.example.factory.createObject
import com.example.interfaces.ConsoleAnnouncer
import com.example.interfaces.PolicmanImpl

class CoronaDesinfector {
    val announcer = createObject(ConsoleAnnouncer::class.java)
    val policman = createObject(PolicmanImpl::class.java)

    fun start(room: Room) {
        announcer.announce("Покиньте помещение, дезинфекция от короны")
        policman.makePeopleLeaveOut()
        desinfector(room)
        announcer.announce("Помещение продезинфицированно")
    }

    private fun desinfector(room: Room) {
        println("Очищение от вируса в $room")
    }
}