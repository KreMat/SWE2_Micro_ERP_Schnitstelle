package at.technikum.wien.winterhalder.kreuzriegler.swe2.request;

public class GetInvoicesByContactIdRequest {

	private long contactId;

	/**
	 * @param contactId
	 */
	public GetInvoicesByContactIdRequest(long contactId) {
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
