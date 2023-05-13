package com.dhemitus.note.feature.domain.use_case

import com.dhemitus.note.feature.domain.model.Note
import com.dhemitus.note.feature.domain.repository.NoteRepository

class GetNote(
    private val repository: NoteRepository
) {
    suspend operator fun invoke(id: Int): Note? {
        return repository.getNoteById(id)
    }
}