package com.example.employee;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Employee {

    private String name;
    private String car;
    private String company;



    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer id;

    public Integer getId() {
        return id;
      }
    
      /**
     * @return the company
     */
    public String getCompany() {
        return company;
    }

    /**
     * @param string the company to set
     */
    public void setCompany(String value) {
        this.company = value;
    }

    public void setId(Integer id) {
        this.id = id;
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
      public void setCar(String value) {
        car = value;
      }
    
}
