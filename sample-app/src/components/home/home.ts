import { CommonModule } from '@angular/common';
import { Component } from '@angular/core';
import { FormsModule } from '@angular/forms';

@Component({
  selector: 'app-home',
  imports: [CommonModule,FormsModule],
  templateUrl: './home.html',
  styleUrl: './home.css',
})
export class Home {
  findBtn: string = 'Find Us';

  btnLabel:string = 'menu button';

  dataList = [
    "naveen","mahesh","navitha","pradeep"
  ];

  status = false;
  // types of forms
  // template driven-> moderate security and reactive forms -> strict security 


}
