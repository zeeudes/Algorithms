package com.zeeudes.change_problem

fun main() {
    change(3.89F, fromCoinToValueArray())
}

fun change(money: Float, c: Array<Float>) {
    var value = money
    for (coin: Float in  c) {
        (value/coin).also { if (it >= 1) message(it, coin) }
        value %= coin
    }
}

fun fromCoinToValueArray() = Coin.values()
    .map { it.value }
    .toTypedArray()
    .sortedArrayDescending()

fun message(value: Float, coin: Float) {
    println("${value.toInt()} coins of ${(coin * 100).toInt()} cents")
}