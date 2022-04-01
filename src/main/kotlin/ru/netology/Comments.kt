package ru.netology
import ru.netology.*

class Comments(
    val count: Int, //количество комментариев
    val canPost: Boolean, //true, текущий пользователь может комментировать
    val groupsCanPost: Boolean, //true, если сообщества могут комментировать
    val canClose: Boolean, //true, текущий пользователь может закрыть комментарии
    val canOpen: Boolean, //true, текущий пользователь может открыть комментарии

) {

}