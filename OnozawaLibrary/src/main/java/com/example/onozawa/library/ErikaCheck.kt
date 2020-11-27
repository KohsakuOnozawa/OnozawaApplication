package com.example.onozawa.library

import java.util.*

class ErikaCheck(private val name: String) {
    val isErika: Boolean = name.toLowerCase(Locale.getDefault()) in "erika"
}