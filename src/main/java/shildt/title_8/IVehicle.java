package shildt.title_8;

/**
 * Создайте интерфейс для класса Vehicle, рассмотренного в главе 7, назвав его IVehicle.
 */
public interface IVehicle {
    int range();

    double fuelneeded(int miles);

    int getPassangers();
    void setPassangers(int p);
    int getFuelCup();
    void setFuelCup(int f);
    int setMpg();
    void getMpg(int m);
}
