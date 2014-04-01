/**
 * 
 */
package at.technikum.wien.winterhalder.kreuzriegler.swe2.request;

/**
 * @author richie
 * 
 */
public class GetContactByIdRequest {
	private int contactId;

	/**
	 * @param contactId
	 */
	public GetContactByIdRequest(int contactId) {
		this.contactId = contactId;
	}

	/**
	 * @return the contactId
	 */
	public int getContactId() {
		return contactId;
	}

	/**
	 * @param contactId
	 *            the contactId to set
	 */
	public void setContactId(int contactId) {
		this.contactId = contactId;
	}

}
