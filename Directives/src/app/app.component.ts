import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  /*template: `<div>
                <!--if value is true it will display the statement else not-->
                <h2 *ngIf="isValid ;else elseBlock">Welcome to  JAVA FULL STACK</h2>
                <ng-template #elseBlock>
                <h2>M25</h2>
                </ng-template>

            </div>

            <br>

            <!--NgSwitch Case-->
            <div [ngSwitch]="color">
              <p *ngSwitchCase="'Hi'">Var is A</p>
              <p *ngSwitchCase="'Hello'">Var is B</p>
              <p *ngSwitchCase="''">No Value </p>

            </div>

            `,*/
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  students: any[]=[
    {
      ID: 1001, Name:"Vidya Paygude",Gender:"female",City:"Pune",Fee:25000
    },
    {
      ID: 1001, Name:"Veena Donhe",Gender:"Female",City:"Mumbai",Fee:65000
    },
    {
      ID: 1001, Name:"Prabha Nivangune",Gender:"Female",City:"Hyderabad",Fee:55000
    }  
  ];
  title = 'Directives';
  isValid: boolean=true;
  color="";
}
