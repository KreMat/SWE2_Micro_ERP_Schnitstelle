/**
 * 
 */
package at.technikum.wien.winterhalder.kreuzriegler.swe2.request;

/**
 * @author richie
 * 
 */
public class GetContactByIdRequest {
	private long contactId;

	/**
	 * @param contactId
	 */
	public GetContactByIdRequest(int contactId) {
		this.contactId = contactId;
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

}
