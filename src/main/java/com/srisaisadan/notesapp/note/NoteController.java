/**
 * 
 */
package com.srisaisadan.notesapp.note;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Indraneel C S
 *
 * @mail indraneelcs@gmail.com
 * 
 */

@RestController
public class NoteController {

	@Autowired
	private NoteService noteService;

	@RequestMapping("/notes")
	public List<Note> getAllNotes() {
		return noteService.getAllNotes();
	}

	@RequestMapping("/notes/{id}")
	public Note getNote(@PathVariable int id) {
		return noteService.getNote(id);
	}

	@RequestMapping(method = RequestMethod.POST, value = "/notes")
	public void addNote(@RequestBody Note note) {
		noteService.addNote(note);
	}

	@RequestMapping(method = RequestMethod.PUT, value = "/notes")
	public void updateNote(@RequestBody Note note) {
		noteService.updateNote(note);
	}

	@RequestMapping(method = RequestMethod.DELETE, value = "/notes")
	public void deleteNote(@RequestBody Note note) {
		noteService.deleteNote(note);
	}
}
