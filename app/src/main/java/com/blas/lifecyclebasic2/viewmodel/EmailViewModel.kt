package com.blas.lifecyclebasic2.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.blas.lifecyclebasic2.model.Email

class EmailViewModel : ViewModel() {
    private val _emails = MutableLiveData<List<Email>>()
    val emails: LiveData<List<Email>> = _emails

    private val _selectedEmail = MutableLiveData<Email?>()
    val selectedEmail: LiveData<Email?> = _selectedEmail

    init {
        loadEmails()
    }

    private fun loadEmails() {
        _emails.value = listOf(
            Email(1, "Alice", "Meeting Today", "Hey, don't forget the meeting at 3 PM.", "10:00 AM"),
            Email(2, "Bob", "Project Update", "The project is on track. See attached report.", "11:30 AM"),
            Email(3, "Charlie", "Lunch?", "Are you free for lunch today?", "12:15 PM"),
            Email(4, "Delta", "Subscription Confirmed", "Your subscription has been successfully renewed.", "01:45 PM"),
            Email(5, "Echo", "Weekend Trip", "Let's plan something for the weekend!", "03:20 PM")
        )
    }

    fun selectEmail(email: Email) {
        _selectedEmail.value = email
    }
}