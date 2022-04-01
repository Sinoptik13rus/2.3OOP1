package ru.netology
import ru.netology.*

class Likes(
    val count: Int, //количество лайков
    val userLikes: Boolean, //true, если есть лайк от текущего пользователя
    val canLike: Boolean, //true, если есть лайк может поставить текущий пользователь
    val canPublish: Boolean //true, если текущий пользователь может сделать репост
) {
}