/**
 * 
 */
package at.technikum.wien.winterhalder.kreuzriegler.swe2.request;

/**
 * @author Matthias
 * 
 */
public class GetContactsBySearchstringRequest {

	private String searchString;

	public GetContactsBySearchstringRequest(String search) {
		this.searchString = search;
	}

	/**
	 * @return the searchString
	 */
	public String getSearchString() {
		return searchString;
	}

	/**
	 * @param searchString
	 *            the searchString to set
	 */
	public void setSearchString(String searchString) {
		this.searchString = searchString;
	}

}
