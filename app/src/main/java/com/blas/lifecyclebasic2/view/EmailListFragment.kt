package com.blas.lifecyclebasic2.view

import android.content.Context
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import com.blas.lifecyclebasic2.R
import com.blas.lifecyclebasic2.databinding.FragmentEmailListBinding
import com.blas.lifecyclebasic2.viewmodel.EmailViewModel

class EmailListFragment : Fragment() {

    private val TAG = "EmailListFragment"
    private var _binding: FragmentEmailListBinding? = null
    private val binding get() = _binding!!
    private val viewModel: EmailViewModel by activityViewModels()

    override fun onAttach(context: Context) {
        super.onAttach(context)
        Log.d(TAG, "EmailListFragment: onAttach")
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d(TAG, "EmailListFragment: onCreate")
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        Log.d(TAG, "EmailListFragment: onCreateView")
        _binding = FragmentEmailListBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        Log.d(TAG, "EmailListFragment: onViewCreated")

        val adapter = EmailAdapter(emptyList()) { email ->
            viewModel.selectEmail(email)
            parentFragmentManager.beginTransaction()
                .replace(R.id.fcv_main, EmailDetailFragment())
                .addToBackStack(null)
                .commit()
        }

        binding.rvEmails.adapter = adapter

        viewModel.emails.observe(viewLifecycleOwner) { emails ->
            adapter.updateData(emails)
        }
    }

    override fun onStart() {
        super.onStart()
        Log.d(TAG, "EmailListFragment: onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.d(TAG, "EmailListFragment: onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.d(TAG, "EmailListFragment: onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.d(TAG, "EmailListFragment: onStop")
    }

    override fun onDestroyView() {
        super.onDestroyView()
        Log.d(TAG, "EmailListFragment: onDestroyView")
        _binding = null
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(TAG, "EmailListFragment: onDestroy")
    }

    override fun onDetach() {
        super.onDetach()
        Log.d(TAG, "EmailListFragment: onDetach")
    }
}