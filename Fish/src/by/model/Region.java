package by.model;

import java.io.Serializable;
import java.util.List;

public class Region implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -8081067564019435155L;
	private String name;
	private List<BanDate> dates;

	public Region() {

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<BanDate> getDates() {
		return dates;
	}

	public void setDates(List<BanDate> dates) {
		this.dates = dates;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((dates == null) ? 0 : dates.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
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
		Region other = (Region) obj;
		if (dates == null) {
			if (other.dates != null)
				return false;
		} else if (!dates.equals(other.dates))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Область: " + name + ". " + dates;
	}

}
