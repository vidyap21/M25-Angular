import { Injectable } from '@angular/core';

@Injectable()
export class StudentService {

  getStudents():any[]
  {
    return[{ID: 1001, Name:"Vidya Paygude",Gender:"female",City:"Pune",Fee:25000},
    {ID: 1001, Name:"Akshay Singh",Gender:"male",City:"Mumbai",Fee:65000},
    {ID: 1001, Name:"Veena Donhe",Gender:"female",City:"Hyderabad",Fee:55000}]
  }
  constructor() { }
}
