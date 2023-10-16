package com.rk;

public class Employee {

		private int empid;
		private String empname;
		private double salary;
		public Employee(int empid, String empname, double salary) {
			super();
			this.empid = empid;
			this.empname = empname;
			this.salary = salary;
		}
		
		
		public int getEmpid() {
			return empid;
		}


		public void setEmpid(int empid) {
			this.empid = empid;
		}


		public String getEmpname() {
			return empname;
		}


		public void setEmpname(String empname) {
			this.empname = empname;
		}


		public double getSalary() {
			return salary;
		}


		public void setSalary(double salary) {
			this.salary = salary;
		}


		public void Display() {
			System.out.println("empid:"+empid);
			System.out.println("empname:"+empname);
			System.out.println("salary:"+salary);
			
		}
	}

	 class PermanentEmployee extends Employee{

		private String designation;
		private int hikePercent;
		public PermanentEmployee(int empid, String empname, double salary, String designation, int hikePercent) {
			super(empid, empname, salary);
			this.designation = designation;
			this.hikePercent = hikePercent;
		}
		
	  	
		public String getDesignation() {
			return designation;
		}


		public void setDesignation(String designation) {
			this.designation = designation;
		}


		public int getHikePercent() {
			return hikePercent;
		}


		public void setHikePercent(int hikePercent) {
			this.hikePercent = hikePercent;
		}


		public void Display() {
			
			System.out.println("designation: "+designation);
			System.out.println("hikePercent: "+hikePercent);
			
			
			
		}

	 }

	 class TemporaryEmployee extends Employee {
			private Float servicePeriod;

			public TemporaryEmployee(int empid, String empname, double salary, Float servicePeriod) {
				super(empid, empname, salary);
				this.servicePeriod = servicePeriod;
			}


			public Float getServicePeriod() {
				return servicePeriod;
			}


			public void setServicePeriod(Float servicePeriod) {
				this.servicePeriod = servicePeriod;
			}


			public void Display() {
				
				System.out.println("servicePeriod: "+servicePeriod);
			}
			
			public void calculateSalaryHike() {
				
				

	        }
	 public static void main(String[] args)
	 {
		 
	 }
}
