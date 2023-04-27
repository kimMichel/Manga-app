package br.com.manga

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import br.com.manga.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var navController: NavController
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val bundle = savedInstanceState ?: intent.extras
        setupNavigationController(bundle)
    }

    private fun setupNavigationController(bundle: Bundle?) {
        val navHostFragment =
            supportFragmentManager.findFragmentById(R.id.nav_host_fragment_container) as NavHostFragment
        val inflater = navHostFragment.navController.navInflater
        navController = navHostFragment.navController
        val graph = inflater.inflate(R.navigation.nav_graph)
        graph.setStartDestination(R.id.signInFragment)
        navController.setGraph(graph, bundle)
    }
}