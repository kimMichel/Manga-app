package br.com.manga.ui.main

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.view.isVisible
import br.com.manga.R
import br.com.manga.databinding.FragmentMainBinding

class MainFragment : Fragment() {

    private lateinit var binding: FragmentMainBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentMainBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setViews()
    }

    private fun setViews() = with(binding) {
        bottomNavigation.setOnItemSelectedListener { item ->
            when (item.itemId) {
                R.id.bnHome -> {
                    homeFragment.root.isVisible = true
                    mangaFragment.root.isVisible = false
                    searchFragment.root.isVisible = false
                    profileFragment.root.isVisible = false
                    true
                }
                R.id.bnManga -> {
                    homeFragment.root.isVisible = false
                    mangaFragment.root.isVisible = true
                    searchFragment.root.isVisible = false
                    profileFragment.root.isVisible = false
                    true
                }
                R.id.bnSearch -> {
                    homeFragment.root.isVisible = false
                    mangaFragment.root.isVisible = false
                    searchFragment.root.isVisible = true
                    profileFragment.root.isVisible = false
                    true
                }
                R.id.bnProfile -> {
                    homeFragment.root.isVisible = false
                    mangaFragment.root.isVisible = false
                    searchFragment.root.isVisible = false
                    profileFragment.root.isVisible = true
                    true
                }
                else -> {true}
            }
        }
    }
}