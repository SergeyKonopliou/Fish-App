package by.model;

import by.main.MonthName;

public class BanDate {
	private int dayStart;
	private int monthStart;
	private int dayEnd;
	private int monthEnd;
	private String action;

	public BanDate() {

	}

	public BanDate(int dayStart, int monthStart, int dayEnd, int monthEnd, String action) {
		this.dayStart = dayStart;
		this.monthStart = monthStart;
		this.dayEnd = dayEnd;
		this.monthEnd = monthEnd;
		this.action = action;
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

	public String getAction() {
		return action;
	}

	public void setAction(String action) {
		this.action = action;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((action == null) ? 0 : action.hashCode());
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
		if (action == null) {
			if (other.action != null)
				return false;
		} else if (!action.equals(other.action))
			return false;
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
		return "Период запрета : " + dayStart + " " + MonthName.values()[monthStart - 1]
				+ " - " + dayEnd + " " + MonthName.values()[monthEnd - 1] + "; Запрещено: "
				+ action;
	}

}
