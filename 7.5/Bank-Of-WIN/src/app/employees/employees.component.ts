import { Component, OnInit } from '@angular/core';
import { Employee } from './employees';
// import { EMPLOYEES } from '../mock-employees'
import { EmployeeService } from '../employee.service';
import { MessageService } from '../message.service';

@Component({
  selector: 'app-employees',
  templateUrl: './employees.component.html',
  styleUrls: ['./employees.component.css']
})


export class EmployeesComponent implements OnInit {

 employees?: Employee[];

 selectedEmployee?: Employee;
 
  constructor(private employeeService: EmployeeService, private messageService: MessageService) { }

  getEmployees(): void {
    this.employeeService.getEmployees()
        .subscribe(employees => this.employees = employees);
    
  }

  ngOnInit() {
    this.getEmployees();
  }

  onSelect (employee: Employee): void {
    this.selectedEmployee = employee;
    this.messageService
    .add(`${employee.name} | ${employee.phone} `);
  }

}
