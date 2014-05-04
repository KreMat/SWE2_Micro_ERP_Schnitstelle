/**
 * 
 */
package at.technikum.wien.winterhalder.kreuzriegler.swe2.response;

import java.util.ArrayList;
import java.util.List;

import at.technikum.wien.winterhalder.kreuzriegler.swe2.dto.ContactDto;

/**
 * @author Matthias
 * 
 */
public class GetContactsBySearchstringResponse {

	private List<ContactDto> contacts = new ArrayList<ContactDto>();

	/**
	 * @param contacts
	 */
	public GetContactsBySearchstringResponse(List<ContactDto> contacts) {
		super();
		this.contacts = contacts;
	}

	/**
	 * @return the contacts
	 */
	public List<ContactDto> getContacts() {
		return contacts;
	}

	/**
	 * @param contacts
	 *            the contacts to set
	 */
	public void setContacts(List<ContactDto> contacts) {
		this.contacts = contacts;
	}

}
