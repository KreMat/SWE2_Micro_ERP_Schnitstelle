/**
 * 
 */
package at.technikum.wien.winterhalder.kreuzriegler.swe2.response;

import java.util.ArrayList;
import java.util.List;

import at.technikum.wien.winterhalder.kreuzriegler.swe2.dto.InvoiceDto;

/**
 * @author richie
 *
 */
public class GetInvoicesBySearchstringResponse {
	
	private List<InvoiceDto> invoices = new ArrayList<InvoiceDto>();

	/**
	 * @param invoices
	 */
	public GetInvoicesBySearchstringResponse(List<InvoiceDto> invoices) {
		super();
		this.invoices = invoices;
	}

	/**
	 * @return the invoices
	 */
	public List<InvoiceDto> getInvoices() {
		return invoices;
	}

	/**
	 * @param invoices the invoices to set
	 */
	public void setInvoices(List<InvoiceDto> invoices) {
		this.invoices = invoices;
	}
	
}
