import { CommonModule } from '@angular/common';
import { Component, inject, Input } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { Header } from "../header/header";
import { Common } from '../../service/common';

@Component({
  selector: 'app-home',
  imports: [CommonModule, FormsModule, Header,],
  templateUrl: './home.html',
  styleUrl: './home.css',
})
export class Home {

  // new way of injecting the service in angular 14 and above
  public commonService = inject(Common);

  // old way of injecting the service in angular 
  // constructor(public commomService:Common){
  //   // we will write block of code, which will be executed when component is rendered!
  // }

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

  openAlert(){
    this.commonService.showAlert("button clicked!");
  }


}

// step-1 -> open integrated terminal 
// step-2 -> generate service file using cmd => ng g s service-name
// step-3 -> write a method and call it in component