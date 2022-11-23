package pt.uma.tspi.arqd;

public class Course {

    private int code,ects,ano;
    private String name;

    public Course(){
        this.code=0;
        this.ects=0;
        this.ano=0;
        this.name="";
    }

    public Course(int code,int ects,int ano,String name){

        this.code=code;
        this.ects=ects;
        this.ano=ano;
        this.name=name;
    }

    public String getName() {
        return name;
    }

    public int getAno() {
        return ano;
    }

    public int getCode() {
        return code;
    }

    public int getEcts() {
        return ects;
    }

    @Override
    public boolean equals(Object obj) {
        Course other = (Course) (obj);
        return this.code==other.code && this.name.equals(other.name);
    }

    @Override
    public String toString() {
        return "Course{" +
                "code=" + code +
                ", ects=" + ects +
                ", ano=" + ano +
                ", name='" + name + '\'' +
                '}';
    }
}
