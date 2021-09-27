package com.codingC0l3.colepad.feature_note.domain.model

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.codingC0l3.colepad.ui.theme.*
import java.lang.Exception

@Entity
data class Note(
    val title: String,
    val content: String,
    val timestamp: Long,
    val color: Int,
    @PrimaryKey val id: Int? = null
) {
    companion object {
        val moteColors = listOf(
            RedOrange, LightGreen,
            Violet, BabyBlue, RedPink
        )
    }
}

class InvalidNoteException(message: String) : Exception(message)