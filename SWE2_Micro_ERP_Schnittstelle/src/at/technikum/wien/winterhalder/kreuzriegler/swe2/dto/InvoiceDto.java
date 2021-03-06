/**
 * 
 */
package at.technikum.wien.winterhalder.kreuzriegler.swe2.dto;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Matthias
 * 
 */
public class InvoiceDto {

	private long id;

	private String nr;

	private long creationdate;

	private long duedate;

	private String comment;

	private String information;

	private long contactId;

	private List<InvoiceRowDto> rows = new ArrayList<InvoiceRowDto>();
	
	private boolean locked = false;

	/**
	 * @return the id
	 */
	public long getId() {
		return id;
	}

	/**
	 * @param id
	 *            the id to set
	 */
	public void setId(long id) {
		this.id = id;
	}

	/**
	 * @return the nr
	 */
	public String getNr() {
		return nr;
	}

	/**
	 * @param nr
	 *            the nr to set
	 */
	public void setNr(String nr) {
		this.nr = nr;
	}

	/**
	 * @return the creationdate
	 */
	public long getCreationdate() {
		return creationdate;
	}

	/**
	 * @param creationdate
	 *            the creationdate to set
	 */
	public void setCreationdate(long creationdate) {
		this.creationdate = creationdate;
	}

	/**
	 * @return the duedate
	 */
	public long getDuedate() {
		return duedate;
	}

	/**
	 * @param duedate
	 *            the duedate to set
	 */
	public void setDuedate(long duedate) {
		this.duedate = duedate;
	}

	/**
	 * @return the comment
	 */
	public String getComment() {
		return comment;
	}

	/**
	 * @param comment
	 *            the comment to set
	 */
	public void setComment(String comment) {
		this.comment = comment;
	}

	/**
	 * @return the information
	 */
	public String getInformation() {
		return information;
	}

	/**
	 * @param information
	 *            the information to set
	 */
	public void setInformation(String information) {
		this.information = information;
	}

	/**
	 * @return the rows
	 */
	public List<InvoiceRowDto> getRows() {
		return rows;
	}

	/**
	 * @param rows
	 *            the rows to set
	 */
	public void setRows(List<InvoiceRowDto> rows) {
		this.rows = rows;
	}

	/**
	 * @return the contactId
	 */
	public long getContactId() {
		return contactId;
	}

	/**
	 * @param contactId
	 *            the contactId to set
	 */
	public void setContactId(long contactId) {
		this.contactId = contactId;
	}

	/**
	 * @return the locked
	 */
	public boolean isLocked() {
		return locked;
	}

	/**
	 * @param locked the locked to set
	 */
	public void setLocked(boolean locked) {
		this.locked = locked;
	}

}
