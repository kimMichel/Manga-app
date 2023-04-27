package br.com.manga.di

import br.com.manga.ui.signin.SignInViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val signInModule = module {
    viewModel { SignInViewModel() }
}