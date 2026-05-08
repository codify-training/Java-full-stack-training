import { CommonModule } from '@angular/common';
import { Component } from '@angular/core';
import { FormControl, FormGroup, FormsModule, ReactiveFormsModule, Validators } from '@angular/forms';
import { Router, RouterLink } from '@angular/router';

@Component({
  selector: 'app-signin',
  imports: [FormsModule, RouterLink, CommonModule,ReactiveFormsModule],
  templateUrl: './signin.html',
  styleUrl: './signin.css',
})
export class Signin {

  email: string = '';
  password: string = '';

  // form intiliaztion for reactive form
  signinForm = new FormGroup({
    email: new FormControl('',[Validators.required,Validators.email]),
    password: new FormControl('', [Validators.required,Validators.minLength(6)])
  });

  
  // loginForm = new FormGroup({});
  // buildForm() {
  //   this.loginForm.addControl('email', new FormControl('', [Validators.required, Validators.email]));
  //   this.loginForm.addControl('password', new FormControl('', [Validators.required, Validators.minLength(6)]));
  // }


  constructor(private router: Router) { }



  onSubmit(signinForm: any) {
    
    const payload = { email: this.email, password: this.password }
    if (signinForm.valid) {
      console.log('Sign in data',payload);
      this.router.navigate(['/home']);
    }
  }




}

// profileForm = new FormGroup({
//   firstName: new FormControl('', Validators.required),
//   email: new FormControl('', [Validators.required, Validators.email])
// });

// onSave() {
//   console.log(this.profileForm.value);
// }