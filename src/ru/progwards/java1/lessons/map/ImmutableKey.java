package ru.progwards.java1.lessons.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class ImmutableKey {
    public static class GeoPoint {
        double lat, lon;

        GeoPoint(double lat, double lon) { this.lat = lat; this.lon = lon; }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            GeoPoint geoPoint = (GeoPoint) o;
            return Double.compare(geoPoint.lat, lat) == 0 &&
                    Double.compare(geoPoint.lon, lon) == 0;
        }

        @Override
        public int hashCode() {
            return Objects.hash(lat, lon);
        }

        @Override
        public String toString() { return "(" + lat + ", " + lon + ')'; }
    }

    public static void main(String[] args) {
        Map<GeoPoint, String> hashMap = new HashMap<>();
        hashMap.put(new GeoPoint(48.4647991,135.0598811), "Хабаровск");
        hashMap.put(new GeoPoint(45.2271915,147.8796713), "Курильск");
        GeoPoint alzamayGP = new GeoPoint(55.5550493,98.6644106);
        hashMap.put(alzamayGP, "Алзамай");
        hashMap.put(new GeoPoint(55.4255534,38.2640794), "Бронницы");
        hashMap.put(new GeoPoint(57.9906873,31.3555076), "Старая Русса");

        System.out.println(hashMap.get(alzamayGP));

        System.out.println("хеш-код alzamayGP = " + alzamayGP.hashCode());
        alzamayGP.lon = 98.6644105;
        System.out.println("хеш-код alzamayGP = " + alzamayGP.hashCode());

        for (var entry : hashMap.entrySet())
            if (alzamayGP.equals(entry.getKey()))
                System.out.println(entry);

        System.out.println(hashMap.get(alzamayGP));
    }
}
