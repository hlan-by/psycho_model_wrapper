package figures;

import desires.Desire;

public interface Figure {
    Desire getDesire(Desire desireToNegotiate);
}
