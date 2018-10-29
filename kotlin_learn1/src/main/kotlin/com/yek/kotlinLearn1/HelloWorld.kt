package com.yek.kotlinLearn1

import java.text.SimpleDateFormat
import java.util.*

/**
 * Created by Administrator on 2018-10-29.
 */
fun main(args: Array<String>){
    var name = "yek"
    val now = SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(Date())
    println("Hello $name!\nThe time is $now!")
}