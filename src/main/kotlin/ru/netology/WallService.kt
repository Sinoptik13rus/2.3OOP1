package ru.netology
import ru.netology.*


object WallService {
    private var posts = emptyArray<Post>()
    private var properties: Int = 0

    fun add(post: Post): Post {
        post.id = properties
        posts += post
        properties += 1
        return posts.last()
    }

    fun likeById(id: Int) {
        for((index, post) in posts.withIndex()) {
            if (post.id == id) {
                posts[index] = post.copy(likes = post.likes + 1)
            }
        }
    }

    fun update(post: Post): Boolean {
        var i = 0
        for (postArr in posts) {
            if (post.id == postArr.id) {
                postArr.id = post.id
                postArr.ownerId = post.ownerId
                postArr.createdBy = post.createdBy
                postArr.text = post.text
                postArr.replyOwnerId = post.replyOwnerId
                postArr.replyPostId = post.replyPostId
                postArr.friendsOnly = post.friendsOnly
                postArr.comments = post.comments
                postArr.copyright = post.copyright
                postArr.likes = post.likes
                postArr.reposts = post.reposts
                postArr.views = post.views
                postArr.postType = post.postType
                postArr.postSource = post.postSource
                postArr.geo = post.geo
                postArr.signerId = post.signerId
                postArr.copyHistory = post.copyHistory
                postArr.canPin = post.canPin
                postArr.canDelete = post.canDelete
                postArr.canEdit = post.canEdit
                postArr.isPinned = post.isPinned
                postArr.markedAsAds = post.markedAsAds
                postArr.ifFavorite = post.ifFavorite
                postArr.donut = post.donut
                postArr.postponedId = post.postponedId

                posts[i] = postArr
                return true
            }
            i += 1
        }
        return false
    }
}