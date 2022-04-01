package ru.netology
import ru.netology.*

import java.util.Objects

data class Post(
    var id: Int, //идентификатор записи
    var ownerId: Int, //идентификатор владельца стены
    val fromId: Int, //идентификатор автора записи
    var createdBy: Int, //идентификатор администратора, который опубликовал
    val date: Int, //время публикации в unixtime
    var text: String, //текст записи
    var replyOwnerId: Int, //идентификатор владельца записи, на которую была оставлена текущая
    var replyPostId: Int, //идентификатор записи, в ответ на которую оставлена текущая
    var friendsOnly: Boolean, //true, если запись создана с опцией "Только для друзей"
    var comments: String, //информация о комментариях к записи
    var copyright: String, //источник материала
    var likes: Int = 0, //информация о лайках к записи
    var reposts: Int, //информация о репостах
    var views: Int, //информация о просмотрах
    var postType: String, //тип записи(post, copy, reply, postpone, suggest)
    var postSource: String, //поле для приложений с ключом доступа
    var geo: String, //местоположение
    var signerId: Int, //идентификатор автора, если запись была выложена сообществом
    var copyHistory: String, //массив с историей репостов
    var canPin: Boolean, //можно ли закрепить запись
    var canDelete: Boolean, //может ли текущий пользователь удалить запись
    var canEdit: Boolean, //может ли текущий пользователь редактировать запись
    var isPinned: Boolean, //информация о том, что запись закреплена
    var markedAsAds: Boolean, //содержить ли запись отметку реклама
    var ifFavorite: Boolean, //true, ели добавлена в закладку у текущего пользователя
    var donut: String, //информация о записи VK Donut
    var postponedId: Int // идентификатор отложенной записи

) {
}