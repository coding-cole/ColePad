package com.codingC0l3.colepad.feature_note.presentation.util

sealed class Screen(val route: String) {
    object NoteScreen: Screen("note")
    object AddEditNoteScreen: Screen("add_edit_note")
}