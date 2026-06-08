package com.blas.lifecyclebasic2.view

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.blas.lifecyclebasic2.databinding.ItemEmailBinding
import com.blas.lifecyclebasic2.model.Email

class EmailAdapter(
    private var emails: List<Email>,
    private val onItemClick: (Email) -> Unit
) : RecyclerView.Adapter<EmailAdapter.EmailViewHolder>() {

    inner class EmailViewHolder(val binding: ItemEmailBinding) : RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): EmailViewHolder {
        val binding = ItemEmailBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return EmailViewHolder(binding)
    }

    override fun onBindViewHolder(holder: EmailViewHolder, position: Int) {
        val email = emails[position]
        holder.binding.email = email
        holder.itemView.setOnClickListener { onItemClick(email) }
        holder.binding.executePendingBindings()
    }

    override fun getItemCount(): Int = emails.size

    fun updateData(newEmails: List<Email>) {
        emails = newEmails
        notifyDataSetChanged()
    }
}