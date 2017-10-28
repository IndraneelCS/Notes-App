/**
 * 
 */
package com.srisaisadan.notesapp.note;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

/**
 * @author Indraneel C S
 *
 * @mail indraneelcs@gmail.com
 * 
 */

@Service
public class NoteService {

	private List<Note> notes = new ArrayList<Note>(Arrays.asList(

			new Note(1, "First Note", "First Note Desc", "First Note Contents"),
			new Note(2, "Second Note", "Second Note Desc", "Second Note Contents")

	));

	/**
	 * @return
	 */
	public List<Note> getAllNotes() {
		return notes;
	}

	/**
	 * @param id
	 * @return
	 */
	public Note getNote(int id) {
		return notes.get(id);
	}

	/**
	 * @param note
	 */
	public void addNote(Note note) {
		notes.add(note);

	}

	/**
	 * @param note
	 */
	public void updateNote(Note note) {
		// TODO Auto-generated method stub

	}

	/**
	 * @param note
	 */
	public void deleteNote(Note note) {
		notes.remove(note);

	}

}
