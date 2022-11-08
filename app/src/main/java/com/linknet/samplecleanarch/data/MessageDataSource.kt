package com.linknet.samplecleanarch.data

import com.linknet.samplecleanarch.domain.MessageEntity

class MessageDataSource: IMessageDataSource {
    override fun getMessageFromSource(name: String): MessageEntity = MessageEntity("Welcome $name")
}