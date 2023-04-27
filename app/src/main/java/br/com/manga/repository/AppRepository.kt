package br.com.manga.repository

import br.com.manga.models.User
import kotlinx.coroutines.flow.MutableStateFlow

class AppRepository {
    val userList: MutableStateFlow<List<User>> = MutableStateFlow(
        listOf(
            User(
                email = "kim98.michel@gmail.com",
                password = "123456"
            )
        )
    )
}