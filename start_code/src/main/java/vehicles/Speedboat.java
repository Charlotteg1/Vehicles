package vehicles;

import products.IProduct;

public class Speedboat extends Vehicle implements IWaterVehicle, IMotorised{
    private String hullType;
    private IMotorised motorised;

    public Speedboat(float weight, int maxSpeed, IProduct baseProduct, String hullType, IMotorised motorised) {
        super(weight, maxSpeed, baseProduct);
        this.hullType = hullType;
        this.motorised = motorised;
    }

    @Override
    public void startEngine() {
        this.motorised.startEngine();
    }

    @Override
    public void stopEngine() {
        this.motorised.stopEngine();
    }

    @Override
    public int getHp() {
        this.motorised.getHp();
    }

    @Override
    public void setHp(int hp) {
        this.motorised.setHp(hp);
    }

    @Override
    public int getFuel() {
       this.motorised.getFuel();
    }

    @Override
    public void setFuel(int fuel) {
        this.motorised.setFuel(fuel);
    }

    @Override
    public String getHullType() {
        return this.hullType;
    }

    @Override
    public void setHullType(String type) {
        this.hullType = hullType;
    }
}
