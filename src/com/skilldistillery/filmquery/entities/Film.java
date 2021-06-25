package com.skilldistillery.filmquery.entities;

public class Film {
private int filmId;
private int releaseYear;
private int languageId;
private int rentalDuration;
private int length;
private double rentalRate;
private double replaceCost;
private String rating;
private String filmTitle;
private String filmDesc;
private String specialFeatures;

public Film(int filmId, String filmTitle, String filmDesc, int releaseYear, int languageId, int rentalDuration, double rentalRate,
		int length, double replaceCost, String rating, String specialFeatures) {
	super();
	this.filmId = filmId;
	this.releaseYear = releaseYear;
	this.rating = rating;
	this.languageId = languageId;
	this.rentalDuration = rentalDuration;
	this.length = length;
	this.setReplaceCost(replaceCost);
	this.rentalRate = rentalRate;
	this.filmTitle = filmTitle;
	this.filmDesc = filmDesc;
	this.specialFeatures = specialFeatures;
}

public Film(int filmId2, String title, String desc, short releaseYear2, int langId, int rentDur, double rate,
		int length2, double repCost, String rating2, String features) {
	// TODO Auto-generated constructor stub
}

public int getFilmId() {
	return filmId;
}
public void setFilmId(int filmId) {
	this.filmId = filmId;
}
public int getReleaseYear() {
	return releaseYear;
}
public void setReleaseYear(int releaseYear) {
	this.releaseYear = releaseYear;
}
public String getRating() {
	return rating;
}
public void setRating(String rating) {
	this.rating = rating;
}
public int getLanguageId() {
	return languageId;
}
public void setLanguage_id(int language_id) {
	this.languageId = language_id;
}
public int getRentalDuration() {
	return rentalDuration;
}
public void setRentalDuration(int rentalDuration) {
	this.rentalDuration = rentalDuration;
}
public int getLength() {
	return length;
}
public void setLength(int length) {
	this.length = length;
}
public double getRentalRate() {
	return rentalRate;
}
public void setRentalRate(double rentalRate) {
	this.rentalRate = rentalRate;
}
public double getReplaceCost() {
	return replaceCost;
}

public void setReplaceCost(double replaceCost) {
	this.replaceCost = replaceCost;
}

public String getFilmTitle() {
	return filmTitle;
}
public void setFilmTitle(String filmTitle) {
	this.filmTitle = filmTitle;
}
public String getFilmDesc() {
	return filmDesc;
}
public void setFilmDesc(String filmDesc) {
	this.filmDesc = filmDesc;
}
public String getSpecialFeatures() {
	return specialFeatures;
}
public void setSpecialFeatures(String specialFeatures) {
	this.specialFeatures = specialFeatures;
}
@Override
public String toString() {
	return "Film [filmId=" + filmId + ", releaseYear=" + releaseYear + ", rating=" + rating + ", language_id="
			+ languageId + ", rentalDuration=" + rentalDuration + ", length=" + length + ", rentalRate=" + rentalRate
			+ ", filmTitle=" + filmTitle + ", filmDesc=" + filmDesc + ", specialFeatures=" + specialFeatures + "]";
}
@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + ((filmDesc == null) ? 0 : filmDesc.hashCode());
	result = prime * result + filmId;
	result = prime * result + ((filmTitle == null) ? 0 : filmTitle.hashCode());
	result = prime * result + languageId;
	result = prime * result + length;
	result = prime * result + releaseYear;
	result = prime * result + rentalDuration;
	long temp;
	temp = Double.doubleToLongBits(rentalRate);
	result = prime * result + (int) (temp ^ (temp >>> 32));
	result = prime * result + ((specialFeatures == null) ? 0 : specialFeatures.hashCode());
	return result;
}
@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Film other = (Film) obj;
	if (filmDesc == null) {
		if (other.filmDesc != null)
			return false;
	} else if (!filmDesc.equals(other.filmDesc))
		return false;
	if (filmId != other.filmId)
		return false;
	if (filmTitle == null) {
		if (other.filmTitle != null)
			return false;
	} else if (!filmTitle.equals(other.filmTitle))
		return false;
	if (languageId != other.languageId)
		return false;
	if (length != other.length)
		return false;
	if (rating != other.rating)
		return false;
	if (releaseYear != other.releaseYear)
		return false;
	if (rentalDuration != other.rentalDuration)
		return false;
	if (Double.doubleToLongBits(rentalRate) != Double.doubleToLongBits(other.rentalRate))
		return false;
	if (specialFeatures == null) {
		if (other.specialFeatures != null)
			return false;
	} else if (!specialFeatures.equals(other.specialFeatures))
		return false;
	return true;
}


}
