package br.com.manga.ui.signin

import androidx.lifecycle.ViewModel
import br.com.manga.repository.AppRepository

class SignInViewModel: ViewModel() {

    private val userRepository = AppRepository()

    fun signIn(email: String, password: String): Boolean {
        val user = userRepository.userList.value.find { it.email == email && it.password == password }
        return user != null
    }
}