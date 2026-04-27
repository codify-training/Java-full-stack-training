import { Component } from '@angular/core';

@Component({
  selector: 'app-header',
  imports: [],
  templateUrl: './header.html',
  styleUrl: './header.css',
})
export class Header {

  title:string = 'Sample App';
  buttonTitle:string='login/signup';
  aboutItem:string  ='About';

  userData= {
    profile:'some-link',
    name:'naveen'
  }

  public clickButton():void {

  }

}
