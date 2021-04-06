import { Injectable } from '@angular/core';
import { Employee } from './employees/employees'
import { EMPLOYEES } from './mock-employees';

import { Observable, of } from 'rxjs';

import {MessageService} from './message.service';

@Injectable({
  providedIn: 'root'
})


export class EmployeeService {
  getEmployees(): Observable<Employee[]> {
    this.messageService.add('EmployeeService: selected Employees');
    return of(EMPLOYEES);
  }

  constructor(private messageService: MessageService) { }
}
