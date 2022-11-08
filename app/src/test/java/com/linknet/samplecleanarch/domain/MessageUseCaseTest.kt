package com.linknet.samplecleanarch.domain

import com.linknet.samplecleanarch.data.MessageRepository
import org.junit.Assert
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith
import org.mockito.Mock
import org.mockito.Mockito.*
import org.mockito.junit.MockitoJUnitRunner

@RunWith(MockitoJUnitRunner::class)
class MessageUseCaseTest {

    private lateinit var messageUseCase: MessageUseCase
    @Mock private lateinit var messageRepository: IMessageRepository

    @Before
    fun setup(){
        messageUseCase = MessageInteractor(messageRepository)
        val dummyMessage = MessageEntity("Hello $name")
        `when`(messageRepository.getWelcomeMessage(name)).thenReturn(dummyMessage)
    }

    @Test fun `should get data from repository`(){
        val message = messageUseCase.getMessage(name)
        verify(messageRepository).getWelcomeMessage(name)
        verifyNoMoreInteractions(messageRepository)
        Assert.assertEquals("Hello $name", message.welcomeMessage)
    }

    companion object{
        const val name = "Dodi"
    }
}