package com.example.interfaces

import com.example.interfaces.Announcer

class ConsoleAnnouncer : Announcer {
    override fun announce(msg: String) {
        println(msg)
    }
}