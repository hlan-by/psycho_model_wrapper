package images;

import desires.Desire;

public interface Image {
    Desire getSpecificDesire(Desire desireToNegotiate);
}
