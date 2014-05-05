/**
 * 
 */
package at.technikum.wien.winterhalder.kreuzriegler.swe2.response;

/**
 * @author richie
 * 
 */
public class CreateOrUpdateInvoiceResponse extends AbstractResponse {

	public CreateOrUpdateInvoiceResponse() {
		super();
	}

	public CreateOrUpdateInvoiceResponse(boolean status, String errorMessage) {
		super(status, errorMessage);
	}

}
