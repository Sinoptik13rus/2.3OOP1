package ru.netology
import ru.netology.*

fun main() {
    var post = Post(
        id = 555,
        ownerId = 1,
        fromId = 32,
        createdBy = 7777,
        date = 153256151,
        text = "Пора всем спать!",
        replyOwnerId = 1717,
        replyPostId = 3,
        friendsOnly = false,
        comments = "Так точно",
        copyright = "Нетология.ру",
        likes = 22,
        reposts = 10,
        views = 1300,
        postType = "reply",
        postSource = "sms",
        geo = "Саранск",
        signerId = 0,
        copyHistory = "121",
        canPin = true,
        canDelete = false,
        canEdit = false,
        isPinned = true,
        markedAsAds = false,
        ifFavorite = true,
        donut = "no donut",
        postponedId = 0
    )
    WallService.add(post)
}