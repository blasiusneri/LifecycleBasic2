package com.blas.lifecyclebasic2.view

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.blas.lifecyclebasic2.databinding.FragmentTopBinding

class MainFragment : Fragment() {

    private var _binding: FragmentTopBinding? = null
    private val binding get() = _binding!!

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        println("MainFragment: onCreate")
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentTopBinding.inflate(inflater, container, false)
        println("MainFragment: onCreateView")
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        println("MainFragment: onViewCreated")
        // Access views via binding here
    }

    override fun onViewStateRestored(savedInstanceState: Bundle?) {
        super.onViewStateRestored(savedInstanceState)
    }

    override fun onStart() {
        super.onStart()
        println("MainFragment: onStart")
    }

    override fun onResume() {
        super.onResume()
        println("MainFragment: onResume")
    }

    override fun onPause() {
        super.onPause()
        println("MainFragment: onPause")
    }

    override fun onStop() {
        super.onStop()
        println("MainFragment: onStop")
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
        println("MainFragment: onDestroyView")
    }

    override fun onDestroy() {
        super.onDestroy()
        println("MainFragment: onDestroy")
    }
}