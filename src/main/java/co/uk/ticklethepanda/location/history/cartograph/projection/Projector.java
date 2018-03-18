package co.uk.ticklethepanda.location.history.cartograph.projection;

public interface Projector {

    LongLat fromEuclidPoint(EuclidPoint point);

    EuclidPoint toEuclidPoint(LongLat longLat);

}
