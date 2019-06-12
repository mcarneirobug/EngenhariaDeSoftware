package tree.exercice1.application;

public class Program {

    public static void main(String [] args) {

        Company company = new Company();

        try {

            //company.addEmployee(new Employee("Matheus", null, 123456, 19, 'M', "Boss", 1500));
            company.addEmployee(new Employee("Raíssa", null, 1516156, 20, 'F', "Employee", 1700));
            company.addEmployee(new Employee("Vitor", null, 255151616, 62, 'M', "Employee", 980));
            
            Employee mat = new Employee("Matheus", null, 123456, 19, 'M', "Boss", 1500);
            company.addEmployee(mat);
            
            company.remover(mat);
            
            System.out.println(company.ordenaSalarioDecrescente());

        }catch (Exception e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }

        System.exit(0);
    }
}