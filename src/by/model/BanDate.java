package by.model;

public class BanDate {
	private int dayStart;
	private int monthStart;
	private int dayEnd;
	private int monthEnd;
	
	public BanDate() {
		
	}
	
	public BanDate(int dayStart,int monthStart,int dayEnd,int monthEnd) {
		this.dayStart = dayStart;
		this.monthStart = monthStart;
		this.dayEnd = dayEnd;
		this.monthEnd = monthEnd;
	}

	public int getDayStart() {
		return dayStart;
	}

	public void setDayStart(int dayStart) {
		this.dayStart = dayStart;
	}

	public int getMonthStart() {
		return monthStart;
	}

	public void setMonthStart(int monthStart) {
		this.monthStart = monthStart;
	}

	public int getDayEnd() {
		return dayEnd;
	}

	public void setDayEnd(int dayEnd) {
		this.dayEnd = dayEnd;
	}

	public int getMonthEnd() {
		return monthEnd;
	}

	public void setMonthEnd(int monthEnd) {
		this.monthEnd = monthEnd;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + dayEnd;
		result = prime * result + dayStart;
		result = prime * result + monthEnd;
		result = prime * result + monthStart;
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
		BanDate other = (BanDate) obj;
		if (dayEnd != other.dayEnd)
			return false;
		if (dayStart != other.dayStart)
			return false;
		if (monthEnd != other.monthEnd)
			return false;
		if (monthStart != other.monthStart)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Дата начала запрета :" + dayStart + "." + monthStart + "; Дата окончания запрета: " + dayEnd + "."
				+ monthEnd;
	}
	
	
}
