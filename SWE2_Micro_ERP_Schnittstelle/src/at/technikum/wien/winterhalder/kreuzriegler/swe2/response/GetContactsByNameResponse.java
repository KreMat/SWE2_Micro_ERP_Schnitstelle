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
public class GetContactsByNameResponse extends AbstractResponse {

	private List<ContactDto> contacts;

	/**
	 * @param contacts
	 */
	public GetContactsByNameResponse(List<ContactDto> contacts) {
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
