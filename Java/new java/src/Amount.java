public class Amount {
	int Principle;
	double Rate;
	double Time;
	double Amount;
	double Interest;

	public Amount(int principle, double rate, double time) {
		super();
		this.Principle = principle;
		this.Rate = rate;
		this.Time = time;

	}

	public int getPrinciple() {
		return Principle;
	}

	public void setPrinciple(int principle) {
		this.Principle = principle;
	}

	public double getRate() {
		return Rate;
	}

	public void setRate(double rate) {
		this.Rate = rate;
	}

	public double getTime() {
		return Time;
	}

	public void setTime(double time) {
		this.Time = time;
	}

	public double Intrests() {
		Interest = (Principle * Rate * Time / 100);
		return Interest;
	}

	public double Amounts() {
		Amount = Principle + this.Intrests();
		return Amount;

	}

}
