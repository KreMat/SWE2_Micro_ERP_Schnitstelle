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
	private Long dateFrom;
	private Long dateTo;
	private Double amountFrom;
	private Double amountTo;

	/**
	 * @param contact
	 * @param dateFrom
	 * @param dateTo
	 * @param amountFrom
	 * @param amountTo
	 */
	public GetInvoicesBySearchstringRequest(String contact, Long dateFrom,
			Long dateTo, Double amountFrom, Double amountTo) {
		super();
		this.contact = contact;
		this.dateFrom = dateFrom;
		this.dateTo = dateTo;
		this.amountFrom = amountFrom;
		this.amountTo = amountTo;
	}

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
	 * @return the dateFrom
	 */
	public Long getDateFrom() {
		return dateFrom;
	}

	/**
	 * @param dateFrom
	 *            the dateFrom to set
	 */
	public void setDateFrom(Long dateFrom) {
		this.dateFrom = dateFrom;
	}

	/**
	 * @return the dateTo
	 */
	public Long getDateTo() {
		return dateTo;
	}

	/**
	 * @param dateTo
	 *            the dateTo to set
	 */
	public void setDateTo(Long dateTo) {
		this.dateTo = dateTo;
	}

	/**
	 * @return the amountFrom
	 */
	public Double getAmountFrom() {
		return amountFrom;
	}

	/**
	 * @param amountFrom
	 *            the amountFrom to set
	 */
	public void setAmountFrom(Double amountFrom) {
		this.amountFrom = amountFrom;
	}

	/**
	 * @return the amountTo
	 */
	public Double getAmountTo() {
		return amountTo;
	}

	/**
	 * @param amountTo
	 *            the amountTo to set
	 */
	public void setAmountTo(Double amountTo) {
		this.amountTo = amountTo;

	}

}
