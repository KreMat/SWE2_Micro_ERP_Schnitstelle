package at.technikum.wien.winterhalder.kreuzriegler.swe2.request;

public class GetInvoicesByContactIdRequest {

	private int contactId;

	/**
	 * @param contactId
	 */
	public GetInvoicesByContactIdRequest(int contactId) {
		this.contactId = contactId;
	}

	/**
	 * @return the contactId
	 */
	public int getContactId() {
		return contactId;
	}

	/**
	 * @param contactId the contactId to set
	 */
	public void setContactId(int contactId) {
		this.contactId = contactId;
	}

}
