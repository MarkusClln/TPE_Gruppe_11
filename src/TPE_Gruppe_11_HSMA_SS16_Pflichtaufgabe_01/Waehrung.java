package TPE_Gruppe_11_HSMA_SS16_Pflichtaufgabe_01;

final class Waehrung extends Waehrungen {
	private final String name;
	private final String kuerzel;
	private final double kurs;

	public Waehrung(String name, String kuerzel, double kurs) {
		this.name = name;
		this.kuerzel = kuerzel;
		this.kurs = kurs;
	}

	public String getKuerzel() {
		return kuerzel;
	}

	public double getKurs() {
		return kurs;
	}

	public String getName() {
		return name;
	}

	
	public long umrechnen(long betrag, Waehrung zielwaehrung) {
		double umgerechneterBetrag = betrag * this.kurs;
		umgerechneterBetrag = umgerechneterBetrag/zielwaehrung.kurs;
		umgerechneterBetrag = Math.round(umgerechneterBetrag * 100) / 100.0;
		umgerechneterBetrag *= 100;
		return (long) umgerechneterBetrag;
	}

	public String toString() {
		return this.name + " " + "[" + this.kuerzel + "] " + "1 $ = " + this.kurs + " " + this.kuerzel;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((kuerzel == null) ? 0 : kuerzel.hashCode());
		long temp;
		temp = Double.doubleToLongBits(kurs);
		result = prime * result + (int) (temp ^ (temp >>> 32));
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
		Waehrung other = (Waehrung) obj;
		if (kuerzel == null) {
			if (other.kuerzel != null)
				return false;
		} else if (!kuerzel.equals(other.kuerzel))
			return false;
		if (Double.doubleToLongBits(kurs) != Double.doubleToLongBits(other.kurs))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

}
