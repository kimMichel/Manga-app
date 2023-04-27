package br.com.manga.ui.signin

import android.content.Context
import android.widget.Toast
import androidx.lifecycle.ViewModel

class SignInViewModel: ViewModel() {
    fun testViewModel(ctx: Context) {
        Toast.makeText(ctx, "Test", Toast.LENGTH_SHORT).show()
    }
}