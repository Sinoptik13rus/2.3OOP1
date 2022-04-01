package ru.netology
import ru.netology.*

class Reposts(
    val count: Int, //число пользователей, скопировавших запись
    val userReposted: Boolean //true, если есть наличие репоста от текущего пользователя
) {
}