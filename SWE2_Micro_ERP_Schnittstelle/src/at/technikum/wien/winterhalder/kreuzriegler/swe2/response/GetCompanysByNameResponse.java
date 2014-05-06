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

	private List<ContactDto> companies;

	/**
	 * @param constacts
	 */
	public GetCompanysByNameResponse(List<ContactDto> companies) {
		super();
		this.companies = companies;
	}

	/**
	 * @return the companies
	 */
	public List<ContactDto> getCompanies() {
		return companies;
	}

	/**
	 * @param companies the companies to set
	 */
	public void setCompanies(List<ContactDto> companies) {
		this.companies = companies;
	}


}
