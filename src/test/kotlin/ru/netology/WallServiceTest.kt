package ru.netology

import org.junit.Test

import org.junit.Assert.*
import ru.netology.*
import ru.netology.WallService.likeById

class WallServiceTest {

    @Test
    fun addTest() {
        val actualExpected = 1

        val result = WallService.add(
            Post(
                id = 6, ownerId = 22, fromId = 4, createdBy = 17, date = 123456789,
                text = "text", replyOwnerId = 777, replyPostId = 15, friendsOnly = true,
                comments = "comments", copyright = "copyright", likes = 22,
                reposts = 44, views = 1717, postType = "reply", postSource = "sms", geo = "Саранск", signerId = 123,
                copyHistory = "121", canPin = true, canDelete = true, canEdit = true, isPinned = true,
                markedAsAds = true, ifFavorite = true, donut = "donut", postponedId = 123
            )
        )
        val result1 = WallService.add(
            Post(
                id = 0, ownerId = 22, fromId = 4, createdBy = 17, date = 123456789,
                text = "text", replyOwnerId = 777, replyPostId = 15, friendsOnly = true,
                comments = "comments", copyright = "copyright", likes = 22,
                reposts = 44, views = 1717, postType = "reply", postSource = "sms", geo = "Саранск", signerId = 123,
                copyHistory = "121", canPin = true, canDelete = true, canEdit = true, isPinned = true,
                markedAsAds = true, ifFavorite = true, donut = "donut", postponedId = 123
            )
        )
        assertEquals(result1.id, actualExpected)
    }

    @Test
    fun updateTestTrue() {
        val result = WallService.add(
            Post(
                id = 6, ownerId = 22, fromId = 4, createdBy = 17, date = 123456789,
                text = "text", replyOwnerId = 777, replyPostId = 15, friendsOnly = true,
                comments = "comments", copyright = "copyright", likes = 22,
                reposts = 44, views = 1717, postType = "reply", postSource = "sms", geo = "Саранск", signerId = 123,
                copyHistory = "121", canPin = true, canDelete = true, canEdit = true, isPinned = true,
                markedAsAds = true, ifFavorite = true, donut = "donut", postponedId = 123
            )
        )
        val result1 = WallService.add(
            Post(
                id = 0, ownerId = 22, fromId = 4, createdBy = 17, date = 123456789,
                text = "text", replyOwnerId = 777, replyPostId = 15, friendsOnly = true,
                comments = "comments", copyright = "copyright", likes = 22,
                reposts = 44, views = 1717, postType = "reply", postSource = "sms", geo = "Саранск", signerId = 123,
                copyHistory = "121", canPin = true, canDelete = true, canEdit = true, isPinned = true,
                markedAsAds = true, ifFavorite = true, donut = "donut", postponedId = 123
            )
        )
        val resultUpdate = WallService.update(
            Post(
                id = 0, ownerId = 222, fromId = 44, createdBy = 117, date = 13456789,
                text = "text1", replyOwnerId = 7777, replyPostId = 15, friendsOnly = true,
                comments = "comments", copyright = "copyright", likes = 222,
                reposts = 44, views = 1717, postType = "reply", postSource = "sms", geo = "Саранск", signerId = 1234,
                copyHistory = "121", canPin = false, canDelete = false, canEdit = false, isPinned = false,
                markedAsAds = false, ifFavorite = false, donut = "donut1", postponedId = 1234
            )
        )
        assertTrue(resultUpdate)
    }

    @Test
    fun updateTestFalse() {
        val addPost = WallService.add(
            Post(
                id = 6, ownerId = 22, fromId = 4, createdBy = 17, date = 123456789,
                text = "text", replyOwnerId = 777, replyPostId = 15, friendsOnly = true,
                comments = "comments", copyright = "copyright", likes = 22,
                reposts = 44, views = 1717, postType = "reply", postSource = "sms", geo = "Саранск", signerId = 123,
                copyHistory = "121", canPin = true, canDelete = true, canEdit = true, isPinned = true,
                markedAsAds = true, ifFavorite = true, donut = "donut", postponedId = 123
            )
        )
        val addPost1 = WallService.add(
            Post(
                id = 0, ownerId = 22, fromId = 4, createdBy = 17, date = 123456789,
                text = "text", replyOwnerId = 777, replyPostId = 15, friendsOnly = true,
                comments = "comments", copyright = "copyright", likes = 22,
                reposts = 44, views = 1717, postType = "reply", postSource = "sms", geo = "Саранск", signerId = 123,
                copyHistory = "121", canPin = true, canDelete = true, canEdit = true, isPinned = true,
                markedAsAds = true, ifFavorite = true, donut = "donut", postponedId = 123
            )
        )
        val update = Post(
            id = 2, ownerId = 222, fromId = 44, createdBy = 117, date = 13456789,
            text = "text1", replyOwnerId = 7777, replyPostId = 15, friendsOnly = true,
            comments = "comments", copyright = "copyright", likes = 222,
            reposts = 44, views = 1717, postType = "reply", postSource = "sms", geo = "Саранск", signerId = 1234,
            copyHistory = "121", canPin = false, canDelete = false, canEdit = false, isPinned = false,
            markedAsAds = false, ifFavorite = false, donut = "donut1", postponedId = 1234
        )
            val result = WallService.update(update)

        result == false
    }

}