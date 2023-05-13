package com.dhemitus.note.feature.presentation.notes

import com.dhemitus.note.feature.domain.model.Note
import com.dhemitus.note.feature.domain.util.NoteOrder
import com.dhemitus.note.feature.domain.util.OrderType

data class NotesState(
    val notes: List<Note> = emptyList(),
    val noteOrder: NoteOrder = NoteOrder.Date(OrderType.Descending),
    val isOrderSectionVisible: Boolean = false
)