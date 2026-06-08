package com.blas.lifecyclebasic2.view

import android.content.Context
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import com.blas.lifecyclebasic2.databinding.FragmentEmailDetailBinding
import com.blas.lifecyclebasic2.viewmodel.EmailViewModel

class EmailDetailFragment : Fragment() {

    private val TAG = "EmailDetailFragment"
    private var _binding: FragmentEmailDetailBinding? = null
    private val binding get() = _binding!!
    private val viewModel: EmailViewModel by activityViewModels()

    override fun onAttach(context: Context) {
        super.onAttach(context)
        Log.d(TAG, "EmailDetailFragment: onAttach")
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d(TAG, "EmailDetailFragment: onCreate")
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        Log.d(TAG, "EmailDetailFragment: onCreateView")
        _binding = FragmentEmailDetailBinding.inflate(inflater, container, false)
        binding.viewModel = viewModel
        binding.lifecycleOwner = viewLifecycleOwner
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        Log.d(TAG, "EmailDetailFragment: onViewCreated")
    }

    override fun onStart() {
        super.onStart()
        Log.d(TAG, "EmailDetailFragment: onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.d(TAG, "EmailDetailFragment: onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.d(TAG, "EmailDetailFragment: onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.d(TAG, "EmailDetailFragment: onStop")
    }

    override fun onDestroyView() {
        super.onDestroyView()
        Log.d(TAG, "EmailDetailFragment: onDestroyView")
        _binding = null
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(TAG, "EmailDetailFragment: onDestroy")
    }

    override fun onDetach() {
        super.onDetach()
        Log.d(TAG, "EmailDetailFragment: onDetach")
    }
}