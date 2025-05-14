/**
 * Represents one person receiving deferred action for childhood arrivals (DACA).
 * 
 * Author: Alyssa Pupping
 * Date: 5/14/25
 *
 * @version 1.2
 **/

/* UML CLASS DIAGRAM:
-----------------------------------------
					DACArecipient
-----------------------------------------
- surname : String
- givenName : String
- uscisNumber : String
- countryOfOrigin : String
- birthday : int
- validFromDate : int
- expirationDate : int
- sex : char
-----------------------------------------
+ getSurname() : String
+ getGivenName() : String
+ getUscisNumber() : String
+ getCountyOfOrigin() : String
+ getBirthDay() : int
+ getValidFromDate() : int
+ getExpirationDate() : int
+ getSex() : char
+ setSurname(surname : String) : void
+ setGivenName(givenName : String) : void
+ setUscisNumber(uscisNumber : String) : void
+ setCountryOfOrigin(countryOfOrigin : String) : void
+ setBirthday(birthday : int) : void
+ setValidFromDate(validFromDate : int) : void
+ setExpirationDate(expirationDate : int) : void
+ setSex(sex : char) : void
+ setAll(surname:String, givenName:String, uscisNumber:String, countryOfOrigin:String, birthday:int, validFromDate:int, expirationDate:int,sex:char) : void
+ toString() : String
+ equals(other : DACArecipient) : boolean
+ printCard() : void
+ jdnToDate(J : int) : String
-----------------------------------------
*/

public class DACArecipient
{

  /***** CONSTANT VARIABLES *****/

  public static final String DEFAULT_SURNAME = "Unknown";
  public static final String DEFAULT_GIVENNAME = "Unknown";
  public static final String DEFAULT_USCISNUMBER = "Unknown";
  public static final String DEFAULT_COUNTRYOFORIGIN = "Unknown";
  public static final int DEFAULT_BIRTHDAY = 0;
  public static final int DEFAULT_VALIDFROMDATE = 0;
  public static final int  DEFAULT_EXPIRATIONDATE = 0;
  public static final char DEFAULT_SEX = 'X';




	/***** INSTANCE VARIABLES *****/
  private String surname;
  private String givenName;
  private String uscisNumber;
  private String countryOfOrigin;
  private int birthday, validFromDate, expirationDate;
  private char sex;
	

  /***** ACCESSORS *****/

	
	public String getSurname() {
		return this.surname;
	}
	public String getGivenName() {
		return this.givenName;
	}
	public String getUscisNumber() {
		return this.uscisNumber;
	}
	public String getCountryOfOrigin() {
		return this.countryOfOrigin;
	}
	public int getBirthday() {
		return this.birthday;
	}
	public int getValidFromDate() {
		return this.validFromDate;
	}
	public int getExpirationDate() {
		return this.expirationDate;
	}
	public char getSex() {
		return this.sex;
	}
	
	/***** MUTATORS *****/

	public void setSurname(String surname) {
		this.surname = surname;
	}
	public void setGivenName(String givenName) {
		this.givenName = givenName;
	}
	public void setUscisNumber(String uscisNumber) {
		this.uscisNumber = uscisNumber;
	}
	public void setCountryOfOrigin(String countryOfOrigin) {
		this.countryOfOrigin = countryOfOrigin;
	}
	public void setBirthday(int birthday) {
		this.birthday = birthday;
	}
	public void setValidFromDate(int validFromDate) {
		this.validFromDate = validFromDate;
	}
	public void setExpirationDate(int expirationDate) {
		this.expirationDate = expirationDate;
	}
	public void setSex(char sex) {
		this.sex = sex;
	}

	public void setAll(String surname, String givenName, String uscisNumber, String countryOfOrigin, 
	int birthday, int validFromDate, int expirationDate, char sex) {
		this.setSurname(surname);
		this.setGivenName(givenName);
		this.setUscisNumber(uscisNumber);
		this.setCountryOfOrigin(countryOfOrigin);
		this.setBirthday(birthday);
		this.setValidFromDate(validFromDate);
		this.setExpirationDate(expirationDate);
		this.setSex(sex);

	}


  /**** CONSTRUCTORS ****/

  /** 
  * Default constructor sets all instance variables to defaults 
  **/
  public DACArecipient() {
    /*  
    surname = "Unknown";
    givenName = "Unkown";
    uscisNumber = "Unknown";
    countryOfOrigin = "Unknown";
    birthday = 2415021;
    validFromDate = 24115021;
    expirationDate = 2415021;
    sex = 'X';
    */

    setAll(DEFAULT_SURNAME, DEFAULT_GIVENNAME, DEFAULT_USCISNUMBER, DEFAULT_COUNTRYOFORIGIN,
    DEFAULT_BIRTHDAY, DEFAULT_VALIDFROMDATE, DEFAULT_EXPIRATIONDATE, DEFAULT_SEX);
  }

  public DACArecipient(String surname, String givenName, String uscisNumber, 
  String countryOfOrigin, int birthday, int validFromDate, int expirationDate, char sex) {
    /* 
    this.surname = surname;
    this.givenName = givenName;
    this.uscisNumber = uscisNumber;
    this.countryOfOrigin = countryOfOrigin;
    this.birthday = birthday;
    this.validFromDate = validFromDate;
    this.expirationDate = expirationDate;
    this.sex = sex;
    */

    setAll(surname, givenName, uscisNumber, countryOfOrigin, birthday, validFromDate, expirationDate, sex);

  }

	/***** OTHER REQUIRED METHODS *****/
  public String toString()
  {
    return "Surname: " + surname + ", Given Name: " + givenName + ", USCIS Number: " + uscisNumber + ", Country of Origin: " + countryOfOrigin + ", Birthday: " + birthday + ", Valid From Date: " + validFromDate + ", Expiration Date: " + expirationDate + ", Sex: " + sex;
  }
}