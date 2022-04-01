package ru.netology

class PostSource(
    val type: String, //значения vk, widget, api, rss, sms
    val platform: String, //значения android, iphone, wphone
    val data: String, //только для type = vk, widget.
    val url: String //url, с которого опубликована запись
) {


}