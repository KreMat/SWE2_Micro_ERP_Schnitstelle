/**
 * 
 */
package at.technikum.wien.winterhalder.kreuzriegler.swe2.request;

import at.technikum.wien.winterhalder.kreuzriegler.swe2.dto.InvoiceDto;

/**
 * @author richie
 *
 */
public class CreateOrUpdateInvoiceRequest {

	private InvoiceDto invoice;
	
	/**
	 * @param invoice
	 */
	public CreateOrUpdateInvoiceRequest(InvoiceDto invoice) {
		super();
		this.invoice = invoice;
	}

	/**
	 * @return the invoice
	 */
	public InvoiceDto getInvoice() {
		return invoice;
	}

	/**
	 * @param invoice the invoice to set
	 */
	public void setInvoice(InvoiceDto invoice) {
		this.invoice = invoice;
	}
	
}
