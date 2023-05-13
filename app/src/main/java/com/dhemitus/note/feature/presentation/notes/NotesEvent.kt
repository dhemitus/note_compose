package com.dhemitus.note.feature.presentation.notes

import com.dhemitus.note.feature.domain.model.Note
import com.dhemitus.note.feature.domain.util.NoteOrder

sealed class NotesEvent {
    data class Order(val noteOrder: NoteOrder): NotesEvent()
    data class DeleteNote(val note: Note): NotesEvent()
    object RestoreNote: NotesEvent()
    object ToggleObjectSection: NotesEvent()
}