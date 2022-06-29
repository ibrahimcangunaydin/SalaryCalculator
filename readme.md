# Salary Calculator
* **Attribute:** name, salary, workHours, hireYear, now, tax, 
bonus, raiseSalary
* **Method:** Employee(), tax(), bonus(), raiseSalary(),
toString()
* **Notes:** 
  * Employee(name, salary, workHours, hireYear): It is a 
constructor method and will take four parameters.
  * tax(): Calculates the tax applied to the salary.
    * If the employee's salary is less than 1000 TL, no 
      tax will be applied.
    * If the employee's salary is more than 1000 TL,3% of 
    her/his salary is taxed.
  * bonus(): If the employee has worked more than 40 hours 
  that week, a bonus of 30 dollars is paid for each hour of 
  extra work.
  * raiseSalary(): Calculates the salary increase based on 
  the employee's start date. 
    * If the employee has been working for less than 10 years, 
    her/his salary will be increased by 5%
    * If the employee has been working for more than 9 years and less 
    than 20 years, her/his salary will be increased by 10%
    * If the employee has been working for more than 19 years,
    her/his salary will be increased by 15%
  * toString(): It prints the employee's information on the screen.