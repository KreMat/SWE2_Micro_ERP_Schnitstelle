/**
 * 
 */
package at.technikum.wien.winterhalder.kreuzriegler.swe2.response;

/**
 * @author richie
 * 
 */
public class CreateOrUpdateContactResponse extends AbstractResponse {

	public CreateOrUpdateContactResponse(boolean status, String errorMessage) {
		super(status, errorMessage);
	}

	public CreateOrUpdateContactResponse() {
		super();
	}

}
