public class Birth {
    private int day;
    private int month;
    private int year;

    public Birth(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }
    public Birth(Birth birth) {
        this.day = birth.day;
        this.month = birth.month;
        this.year = birth.year;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
