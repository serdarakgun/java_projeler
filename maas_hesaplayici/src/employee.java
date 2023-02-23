public class employee {

    String name;
    double salary;
    int workHour;
    int hireYear;

    employee(String name,double salary,int workHour,int hireYear){
        this.name=name;
        this.salary=salary;
        this.workHour=workHour;
        this.hireYear=hireYear;
        bonus();
        raiseSalary();
        tax();

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getWorkHour() {
        return workHour;
    }

    public void setWorkHour(int workHour) {
        this.workHour = workHour;
    }

    public int getHireYear() {
        return hireYear;
    }

    public void setHireYear(int hireYear) {
        this.hireYear = hireYear;
    }

    void tax(){

        if(this.salary>=1000){
            System.out.println("Vergi: "+this.salary*3/100);
        }

    }

    void bonus(){
        if(this.workHour>=40){
            System.out.println("Bonus: "+(this.workHour-40)*30);

        }
    }
    void raiseSalary(){
        int workTime=2021;
        workTime=workTime-hireYear;
        if(workTime>9 && workTime<20){
            System.out.println("Maaş artışı: "+(this.salary/100*10));
            this.salary+=this.salary/100*10;
        }
        else if(workTime>19){
            System.out.println("Maaş artışı: "+(this.salary/100*15));
            this.salary+=this.salary/100*15;
        }
        else{
            System.out.println("Maaş artışı: "+(this.salary/100*5));
            this.salary+=this.salary/100*5;
        }
    }

    public String toString(){
        return String.format("İsim: %s\nMaaş: %.2f\nÇalışma Saati: %d\nBaşlangıç Yılı: %d\n",this.name,this.salary,this.workHour,this.hireYear);
    }
}
