package at.technikum.wien.winterhalder.kreuzriegler.swe2.response;

import java.util.ArrayList;
import java.util.List;

import at.technikum.wien.winterhalder.kreuzriegler.swe2.dto.AddressDto;

public class GetContactAddressResponse {

	private List<AddressDto> addresses = new ArrayList<AddressDto>();

	/**
	 * @return the addresses
	 */
	public List<AddressDto> getAddresses() {
		return addresses;
	}

	/**
	 * @param addresses
	 *            the addresses to set
	 */
	public void setAddresses(List<AddressDto> addresses) {
		this.addresses = addresses;
	}

}
