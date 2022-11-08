package com.linknet.samplecleanarch.domain

interface IMessageRepository {
    fun getWelcomeMessage(name: String): MessageEntity
}