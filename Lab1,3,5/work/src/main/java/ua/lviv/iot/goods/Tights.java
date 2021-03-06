package ua.lviv.iot.goods;

import ua.lviv.iot.enums.Season;
import ua.lviv.iot.enums.Sex;
import ua.lviv.iot.enums.Type;

public class Tights extends Good {
    private int size;

    public Tights(final String modelName, final Sex sex, final Season season,
                  final double price, final String producer, final int size) {
        super(modelName, sex, season, Type.TIGHTS, price, producer);
        setSize(size);
    }

    @Override
    public final String toString() {
        return "Tights{" + super.toString()
                + "size=" + getSize()
                + '}';
    }

    public final int getSize() {
        return size;
    }

    public final void setSize(final int size) {
        this.size = size;
    }
}
