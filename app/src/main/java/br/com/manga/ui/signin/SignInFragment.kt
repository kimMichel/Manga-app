package br.com.manga.ui.signin

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import br.com.manga.databinding.FragmentSigninBinding
import br.com.manga.extension.navigator
import br.com.manga.extension.safeNavigate
import org.koin.android.ext.android.inject

class SignInFragment : Fragment() {

    private lateinit var binding: FragmentSigninBinding
    private val viewModel: SignInViewModel by inject()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentSigninBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.button.setOnClickListener {
            Log.d("SignIn_Button", "Button pressed")
            SignInFragmentDirections.actionSignInFragmentToHomeFragment().apply {
                navigator.safeNavigate(this)
            }
        }
    }
}