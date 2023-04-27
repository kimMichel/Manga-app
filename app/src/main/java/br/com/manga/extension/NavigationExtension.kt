package br.com.manga.extension

import android.util.Log
import androidx.navigation.NavController
import androidx.navigation.NavDirections

fun NavController.safeNavigate(dir: NavDirections) {
    try {
        navigate(dir)
    } catch (e: Exception) {
        Log.e("NavigationExtension", e.message, e)
    }
}