package com.dhemitus.note.feature.domain.use_case

import com.dhemitus.note.feature.domain.model.Note
import com.dhemitus.note.feature.domain.repository.NoteRepository

class DeleteNote(
    private val repository: NoteRepository
) {
    suspend operator fun invoke(note: Note) {
        repository.deleteNote(note)
    }
}