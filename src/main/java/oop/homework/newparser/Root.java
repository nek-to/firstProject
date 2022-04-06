package oop.homework.newparser;

public class Root {
    public String ip;
    public String country_code;
    public String country_name;
    public String region_code;
    public String region_name;
    public String city;
    public String zip_code;
    public String time_zone;
    public double latitude;
    public double longitude;
    public int metro_code;

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getCountry_code() {
        return country_code;
    }

    public void setCountry_code(String country_code) {
        this.country_code = country_code;
    }

    public String getCountry_name() {
        return country_name;
    }

    public void setCountry_name(String country_name) {
        this.country_name = country_name;
    }

    public String getRegion_code() {
        return region_code;
    }

    public void setRegion_code(String region_code) {
        this.region_code = region_code;
    }

    public String getRegion_name() {
        return region_name;
    }

    public void setRegion_name(String region_name) {
        this.region_name = region_name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getZip_code() {
        return zip_code;
    }

    public void setZip_code(String zip_code) {
        this.zip_code = zip_code;
    }

    public String getTime_zone() {
        return time_zone;
    }

    public void setTime_zone(String time_zone) {
        this.time_zone = time_zone;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public int getMetro_code() {
        return metro_code;
    }

    public void setMetro_code(int metro_code) {
        this.metro_code = metro_code;
    }

    @Override
    public String toString() {
        return "Root{" +
                "ip='" + ip + '\'' +
                ", country_code='" + country_code + '\'' +
                ", country_name='" + country_name + '\'' +
                ", region_code='" + region_code + '\'' +
                ", region_name='" + region_name + '\'' +
                ", city='" + city + '\'' +
                ", zip_code='" + zip_code + '\'' +
                ", time_zone='" + time_zone + '\'' +
                ", latitude=" + latitude +
                ", longitude=" + longitude +
                ", metro_code=" + metro_code +
                '}';
    }
}
