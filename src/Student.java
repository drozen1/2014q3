public class Student {
    private String name;
    private Birth birthDay;

    public Student(String name, Birth birthDay) {
        this.name = name;
        this.birthDay =new Birth(birthDay);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Birth getBirthDay() {
        return new Birth(birthDay);
    }

    public void setBirthDay(Birth birthDay) {
        this.birthDay = new Birth(birthDay);
    }
}
