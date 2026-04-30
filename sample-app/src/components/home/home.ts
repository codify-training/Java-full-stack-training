import { CommonModule } from '@angular/common';
import { Component, Input } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { Header } from "../header/header";
import { Parent } from "../parent/parent";
import { Child } from "../child/child";

@Component({
  selector: 'app-home',
  imports: [CommonModule, FormsModule, Header, Child],
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

  receievedData(data:any){
    console.log("received data",data);
  }


}
