package com.example.config

interface Config {
    fun <T> getImplClass(type: Class<T>): T
}