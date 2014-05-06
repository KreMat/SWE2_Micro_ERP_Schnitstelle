/**
 * 
 */
package at.technikum.wien.winterhalder.kreuzriegler.swe2.response;

import java.util.List;

import at.technikum.wien.winterhalder.kreuzriegler.swe2.dto.ContactDto;

/**
 * @author richie
 * 
 */
public class GetCompanysByNameResponse extends AbstractResponse {

	private List<ContactDto> contacts;

	/**
	 * @param constacts
	 */
	public GetCompanysByNameResponse(List<ContactDto> constacts) {
		super();
		this.contacts = constacts;
	}

	/**
	 * @return the constacts
	 */
	public List<ContactDto> getConstacts() {
		return contacts;
	}

	/**
	 * @param constacts
	 *            the constacts to set
	 */
	public void setConstacts(List<ContactDto> constacts) {
		this.contacts = constacts;
	}

}
