package com.indus.training.domain.spec;

public interface IHondaCar {

	public void drive();

	public void stop();

	public void start();

	public void acclerate();

	public void setBody(IHondaBody body);

	public void setEngine(IHondaEngine engine);

	public void setSeats(ISeat[] seats);

	public void setTyres(ITyre[] tyres);
}
