/**
 * 
 */
package at.technikum.wien.winterhalder.kreuzriegler.swe2.response;

/**
 * @author richie
 * 
 */
public class CreateOrUpdateInvoiceResponse {
	private boolean status;
	private String msg;

	public CreateOrUpdateInvoiceResponse(boolean status, String msg) {
		this.status = status;
		this.msg = msg;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}
}
