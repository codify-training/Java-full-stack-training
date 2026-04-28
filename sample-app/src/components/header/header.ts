import { Component } from '@angular/core';

@Component({
  selector: 'app-header',
  imports: [],
  templateUrl: './header.html',
  styleUrl: './header.css',
})
export class Header {

  title: string = 'Sample App';
  buttonTitle: string = 'login/signup';
  aboutItem: string = 'About';

  usersCount: number = 1;
  isLoggedIn: boolean = true;
  trueValue = true;
  falseValue = false;

  naveen ="naveen";

  userData = {
    profile: 'https://picsum.photos/536/354',
    name: 'naveen'
  }

  buttonType:string = "button";

  profileUrl = 'https://picsum.photos/536/354';

  clickButton(): void {
    alert("Text changed");
    this.naveen = "angular app!"
  }

  updateInput(data:any){
    console.log("data",data);
  }
  
}
