package com.example.employee;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Employee {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer id;

    public Employee(){

        super();
    }

    public Employee(String name, String car, String company){

        super();

        this.name = name;
        this.car = car;
        this.company = company;

    }

    public Integer getId() {
        return id;
      }
      public void setId(Integer id) {
        this.id = id;
      }
    
      /**
     * @return the company
     */


    private String name;
    private String car;
    private String company;

    public String getCompany() {
        return company;
    }

    /**
     * @param string the company to set
     */
    public void setCompany(String value) {
        this.company = value;
    }

      public void setName(String v)
      {
          name = v;
      }  

      public String getName()
      {
          return name;
      }
  
      public String getCar() {
        return car;
    }
      public void setCar(String v) {
        car = v;
      }
}
