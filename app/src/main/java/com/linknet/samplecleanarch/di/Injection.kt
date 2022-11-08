package com.linknet.samplecleanarch.di

import com.linknet.samplecleanarch.data.IMessageDataSource
import com.linknet.samplecleanarch.data.MessageDataSource
import com.linknet.samplecleanarch.data.MessageRepository
import com.linknet.samplecleanarch.domain.IMessageRepository
import com.linknet.samplecleanarch.domain.MessageInteractor
import com.linknet.samplecleanarch.domain.MessageUseCase

object Injection {
    fun provideUseCase(): MessageUseCase{
        val messageRepository = provideRepository()
        return MessageInteractor(messageRepository)
    }

    private fun provideRepository(): IMessageRepository{
        val messageDataSource = provideDataSource()
        return MessageRepository(messageDataSource)
    }

    private fun provideDataSource(): IMessageDataSource{
        return MessageDataSource()
    }
}