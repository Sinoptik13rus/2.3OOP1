package ru.netology

import java.util.Objects

class Geo(
    val type: String, //тип места
    val coordinates: String, //координаты места
    val place: Objects // описание места
) {
}