/**
 * 
 */
package at.technikum.wien.winterhalder.kreuzriegler.swe2.request;

/**
 * @author richie
 *
 */
public class GetInvoicesBySearchstringRequest {

	private String contact;
	private String dateRange;
	private String amountRange;

	/**
	 * @return the contact
	 */
	public String getContact() {
		return contact;
	}

	/**
	 * @param contact
	 *            the contact to set
	 */
	public void setContact(String contact) {
		this.contact = contact;
	}

	/**
	 * @return the dateRange
	 */
	public String getDateRange() {
		return dateRange;
	}

	/**
	 * @param dateRange
	 *            the dateRange to set
	 */
	public void setDateRange(String dateRange) {
		this.dateRange = dateRange;
	}

	/**
	 * @return the amountRange
	 */
	public String getAmountRange() {
		return amountRange;
	}

	/**
	 * @param amountRange
	 *            the amountRange to set
	 */
	public void setAmountRange(String amountRange) {
		this.amountRange = amountRange;
	}
}
