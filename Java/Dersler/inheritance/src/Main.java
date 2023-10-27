public class Main {
    public static void main(String[] args) {
        // javada miras bir classtan diğerine bırakılır.
        // bu örnekte hem employe(çalışan) hem customer(müşteri) classı person clasının mirasını alır.
        // ama miras alsaLalar bile kendi özelliklerini korurlar
        customer customer=new customer();
        employee employee= new employee();
        employee.salary=3000;
        System.out.println(employee.salary);
        customerManager customerManager= new customerManager();
        employeeMenegar employeeMenegar=new employeeMenegar();
        employeeMenegar.Bestemploye();

    }
}