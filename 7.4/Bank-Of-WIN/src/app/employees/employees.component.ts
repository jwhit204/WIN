import { Component, OnInit } from '@angular/core';
import { Employee } from './employees';
import { EMPLOYEES } from '../mock-employees'

@Component({
  selector: 'app-employees',
  templateUrl: './employees.component.html',
  styleUrls: ['./employees.component.css']
})
export class EmployeesComponent implements OnInit {

employees= EMPLOYEES;

  constructor() { }

  ngOnInit(): void {
  }

}
