import { Component } from '@angular/core';

@Component({
  selector: 'app-student',
  templateUrl: './student.component.html',
  //External style
  //styleUrls: ['./student.component.css']
  //Internal Style in the component file
  styles:[`table{
    color: brown;
    font-family:'Courier New', Courier, monospace;
    font-size: large;
    border-collapse:collapse ;
}

td{
    border: 1px solid black;
}`]
})
export class StudentComponent {
  Name:string="Vrushali";
  Email:string="varankarvrushali07@gmail.com";
}
