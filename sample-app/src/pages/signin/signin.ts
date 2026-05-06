import { Component } from '@angular/core';
import { Router, RouterLink } from '@angular/router';

@Component({
  selector: 'app-signin',
  imports: [RouterLink],
  templateUrl: './signin.html',
  styleUrl: './signin.css',
})
export class Signin {
  constructor(private router:Router) {}

  navigateHome(){
    this.router.navigate(['/home']);
  }

}
