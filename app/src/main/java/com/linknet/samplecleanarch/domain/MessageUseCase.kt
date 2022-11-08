package com.linknet.samplecleanarch.domain

interface MessageUseCase {
    fun getMessage(name: String): MessageEntity
}