/**
 * 
 */
package com.srisaisadan.notesapp.note;

/**
 * @author Indraneel C S
 *
 * @mail indraneelcs@gmail.com
 * 
 */
public class Note {

	private int id;
	private String name;
	private String desc;
	private String contents;

	public Note() {

	}

	/**
	 * @param id
	 * @param name
	 * @param desc
	 * @param contents
	 */
	public Note(int id, String name, String desc, String contents) {
		super();
		this.id = id;
		this.name = name;
		this.desc = desc;
		this.contents = contents;
	}

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id
	 *            the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name
	 *            the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the desc
	 */
	public String getDesc() {
		return desc;
	}

	/**
	 * @param desc
	 *            the desc to set
	 */
	public void setDesc(String desc) {
		this.desc = desc;
	}

	/**
	 * @return the contents
	 */
	public String getContents() {
		return contents;
	}

	/**
	 * @param contents
	 *            the contents to set
	 */
	public void setContents(String contents) {
		this.contents = contents;
	}

}
