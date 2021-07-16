package com.example.factory

import com.example.config.Config
import com.example.config.JavaConfig

fun <T> createObject(type: Class<T>): T {
    val implClass: T
    val config = JavaConfig()
    if (type.isInterface) {
        implClass = config.getImplClass(type)
    }
}
class ObjectFactory {
    val ourInstance = ObjectFactory()

}