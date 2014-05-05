/**
 * 
 */
package at.technikum.wien.winterhalder.kreuzriegler.swe2.response;

/**
 * @author Matthias
 * 
 */
public abstract class AbstractResponse {

	protected boolean status = true;

	protected String errorMessage;

	public AbstractResponse() {
		super();
	}

	public AbstractResponse(boolean status, String errorMessage) {
		super();
		this.status = status;
		this.errorMessage = errorMessage;
	}

	/**
	 * @return the status
	 */
	public boolean isStatus() {
		return status;
	}

	/**
	 * @param status
	 *            the status to set
	 */
	public void setStatus(boolean status) {
		this.status = status;
	}

	/**
	 * @return the errorMessage
	 */
	public String getErrorMessage() {
		return errorMessage;
	}

	/**
	 * @param errorMessage
	 *            the errorMessage to set
	 */
	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

}
