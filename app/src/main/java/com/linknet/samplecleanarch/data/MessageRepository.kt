package com.linknet.samplecleanarch.data

import com.linknet.samplecleanarch.domain.IMessageRepository
import com.linknet.samplecleanarch.domain.MessageEntity

class MessageRepository(private val messageDataSource: IMessageDataSource): IMessageRepository {
    override fun getWelcomeMessage(name: String): MessageEntity = messageDataSource.getMessageFromSource(name)
}