package ru.netology
import ru.netology.*

import java.util.Objects

class Donut(
    val isDonut: Boolean, //запись доступна только платным пользователям
    val paidDuration: Int, //время в течении которого будет доступна запись
    val placeholder: Objects, //заглушка, которая отобразиться при неактивной подписке
    val canPublishFreeCopy: Boolean, //можно ли открыть запись для всех пользователей
    val editMod: String //значения для изменений: all - все, duration - время для платных
) {
}