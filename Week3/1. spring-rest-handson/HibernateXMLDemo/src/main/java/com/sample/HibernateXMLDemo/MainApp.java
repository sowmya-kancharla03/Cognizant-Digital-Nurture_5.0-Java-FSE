package com.sample.HibernateXMLDemo;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class MainApp {

    public static void main(String[] args) {

        Session session = HibernateUtil.getSessionFactory().openSession();

        // Insert
        Transaction tx = session.beginTransaction();

        Employee emp = new Employee();
        emp.setId(101);
        emp.setFirstName("John");
        emp.setLastName("David");
        emp.setSalary(50000);

        session.persist(emp);
        tx.commit();

        System.out.println("Employee Saved Successfully!");

        // Fetch All Employees
        List<Employee> list = session.createQuery("from Employee", Employee.class).list();

        System.out.println("\nEmployee Details:");

        for (Employee e : list) {
            System.out.println(e.getId() + " "
                    + e.getFirstName() + " "
                    + e.getLastName() + " "
                    + e.getSalary());
        }

        // Fetch Employee by ID
        Employee employee = session.get(Employee.class, 101);

        System.out.println("\nEmployee Found:");
        System.out.println(employee.getFirstName());

        // Delete Employee
        Transaction tx2 = session.beginTransaction();

        session.remove(employee);

        tx2.commit();

        System.out.println("\nEmployee Deleted Successfully!");

        session.close();
    }
}