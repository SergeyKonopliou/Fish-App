package by.model;

import java.util.Map;

public class CatalogFish<T extends Comparable<T>> {
	private Map<String, Fish> fishes;

	public CatalogFish() {

	}

	public CatalogFish(Map<String, Fish> fishes) {
		this.fishes = fishes;
	}

	public Map<String, Fish> getFishes() {
		return fishes;
	}

	public void setFishes(Map<String, Fish> fishes) {
		this.fishes = fishes;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((fishes == null) ? 0 : fishes.hashCode());
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
		CatalogFish<?> other = (CatalogFish<?>) obj;
		if (fishes == null) {
			if (other.fishes != null)
				return false;
		} else if (!fishes.equals(other.fishes))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "CatalogFish:\n" + fishes;
	}

}
