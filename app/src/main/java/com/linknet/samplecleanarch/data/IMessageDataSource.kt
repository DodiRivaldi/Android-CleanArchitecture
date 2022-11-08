package com.linknet.samplecleanarch.data

import com.linknet.samplecleanarch.domain.MessageEntity

interface IMessageDataSource {
    fun getMessageFromSource(name: String): MessageEntity
}