package com.skilldistillery.filmquery.entities;

import java.util.ArrayList;
import java.util.List;

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
private List<Actor> list = new ArrayList<Actor>();

public Film(int filmId, String filmTitle, String filmDesc, int releaseYear, int languageId, int rentalDuration, double rentalRate,
		int length, double replaceCost, String rating, String specialFeatures, List<Actor> list) {
	super();
	this.filmId = filmId;
	this.releaseYear = releaseYear;
	this.rating = rating;
	this.languageId = languageId;
	this.rentalDuration = rentalDuration;
	this.length = length;
	this.replaceCost = replaceCost;
	this.rentalRate = rentalRate;
	this.filmTitle = filmTitle;
	this.filmDesc = filmDesc;
	this.specialFeatures = specialFeatures;
	this.list = list;
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
public void setLanguageId(int languageId) {
	this.languageId = languageId;
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
public List<Actor> getList() {
	return list;
}
public void setList(List<Actor> list) {
	this.list = list;
}
@Override
public String toString() {
	String language = "";
	switch (languageId) {
	case 1:
		language = "English";
		break;
	case 2:
		language = "Italian";
		break;
	case 3:
		language = "Japanese";
		break;
	case 4:
		language = "Mandarin";
		break;
	case 5:
		language = "French";
		break;
	case 6:
		language = "German";
		break;
	}
	return "Film Title: " + filmTitle + "\r" + "Release Year: " + releaseYear + "\r"
	+ "Rating: " + rating + " Language: " + language + "\r\r" + "Description: " + filmDesc + "\r\r" + "Cast: " + list;
//	return "Film ID: " + filmId + ", Release Year: " + releaseYear + ", Rating: " + rating + ", Language ID: "
//			+ languageId + "\r" + "Rental Duration: " + rentalDuration + ", Length: " + length + ", Replacement Cost $" + replaceCost + ", Rental Rate $" + rentalRate
//			+ "\r" + "Film Title: " + filmTitle + "\r" + "Film Description: " + filmDesc + "\r" + "Special Features: " + specialFeatures + "\r"
//			+ "Cast: " + list;

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
