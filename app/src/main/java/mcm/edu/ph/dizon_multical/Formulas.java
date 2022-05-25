package mcm.edu.ph.dizon_multical;

public class Formulas {
    //Speed
    public double Speed(double distance, double time) { return distance / time; }
    //Density
    public double Density(double mass, double volume) { return mass / volume; }
    //Force
    public double Force(double mass, double acceleration) { return mass / acceleration; }
    //Weight
    public double Weight(double mass, double acceleration) { return mass * acceleration; }

}
