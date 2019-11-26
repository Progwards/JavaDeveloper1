package ru.progwards.java1.lessons.sets;

import org.jetbrains.annotations.NotNull;

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetWithLatComparator {
    public static class GeoPoint implements Comparable<GeoPoint> {
        double lat = 0;
        double lon = 0;

        public GeoPoint(double lat, double lon) { this.lat = lat; this.lon = lon;}

        @Override
        public String toString() {
            return "GeoPoint{lat=" + lat + ", lon=" + lon + '}';
        }

        @Override
        public int compareTo(@NotNull TreeSetWithLatComparator.GeoPoint o) {
            return Double.compare(dist2Zero(lat, lon), dist2Zero(o.lat, o.lon));
        }
    }

    public static void main(String[] args) {
        TreeSet<GeoPoint> treeSet = new TreeSet<>(new Comparator<GeoPoint>() {
            @Override
            public int compare(GeoPoint o1, GeoPoint o2) {
                return Double.compare(o1.lat, o2.lat);
            }
        });
        treeSet.add(new GeoPoint(55.751091,37.6135763)); // Москва
        treeSet.add(new GeoPoint(43.1736206,131.8957547)); // Владивосток
        treeSet.add(new GeoPoint(54.969655,82.6692294)); // Новосибирск

        System.out.println(treeSet);
    }

    public static double dist2Zero(double lat, double lon) {
        return 111.111 * Math.sqrt(lon*lon + lat*Math.cos(Math.PI*lon/180)*lat*Math.cos(Math.PI*lon/180));
    }
}
