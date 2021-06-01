package by.model;


import java.util.Map;

public class Fish implements Comparable<Fish> {
	private String name;
	private String description;
	private Map<String, String> behavior;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Map<String, String> getBehavior() {
		return behavior;
	}

	public void setBehavior(Map<String, String> behavior) {
		this.behavior = behavior;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((behavior == null) ? 0 : behavior.hashCode());
		result = prime * result + ((description == null) ? 0 : description.hashCode());
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
		Fish other = (Fish) obj;
		if (behavior == null) {
			if (other.behavior != null)
				return false;
		} else if (!behavior.equals(other.behavior))
			return false;
		if (description == null) {
			if (other.description != null)
				return false;
		} else if (!description.equals(other.description))
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
		StringBuilder str = new StringBuilder();
		int count = 0;
		for(Map.Entry<String, String> item : behavior.entrySet()){
			if(count == 6) {
				str.append("\n");
			}
	           str.append(item.getKey()).append(" - ");
	           str.append(item.getValue()).append("; ");
	           count++;
	       }
		return name + "\n" + description + "\n\n" + str + "\n";
	}

	@Override
	public int compareTo(Fish o) {
		return (int) (this.name.charAt(0) - o.name.charAt(0));
	}

}
