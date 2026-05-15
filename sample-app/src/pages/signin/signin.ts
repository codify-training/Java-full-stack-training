import { CommonModule } from '@angular/common';
import { HttpClient } from '@angular/common/http';
import { Component } from '@angular/core';
import { FormControl, FormGroup, FormsModule, ReactiveFormsModule, Validators } from '@angular/forms';
import { Router, RouterLink } from '@angular/router';
import { SigninService } from '../../service/signin-service';

@Component({
  selector: 'app-signin',
  imports: [FormsModule, RouterLink, CommonModule, ReactiveFormsModule],
  templateUrl: './signin.html',
  styleUrl: './signin.css',
})
export class Signin {

  email: string = '';
  password: string = '';

  // form intiliaztion for reactive form
  signinForm = new FormGroup({
    email: new FormControl('', [Validators.required, Validators.email]),
    password: new FormControl('', [Validators.required, Validators.minLength(6)])
  });

  // loginForm = new FormGroup({});
  // buildForm() {
  //   this.loginForm.addControl('email', new FormControl('', [Validators.required, Validators.email]));
  //   this.loginForm.addControl('password', new FormControl('', [Validators.required, Validators.minLength(6)]));
  // }

  constructor(private router: Router, private http: HttpClient, private signinService: SigninService) { }

  // direct API integration directly from component
  onSubmit(signinForm: any) {
    // method calling in Angular
    this.getAllData();
    const payload = {
      email: this.email, 
      password: this.password 
    }
    if (signinForm.valid) {
      console.log('Sign in data', payload);
      // this.router.navigate(['/home']);
    }
    // API call for login
    this.http.post('https://dummyjson.com/auth/login', payload).subscribe((data: any) => {
      console.log("data", data);
      if (data) {
        // if login success, this block of code will be executed
      }
      // error methods will be hanlded
      else {
        // if any error occurs then this block will execute
      }
    }, error => {
      alert("Something went wrong!");
      console.log("Something went wrong!", error);
    })
  }

  // API integration using service => preferred appraoch
  onLogin(signinForm: any) {
    const payload = { email: this.email, password: this.password }
    if (signinForm.valid) {
      console.log('Sign in data', payload);
      // this.router.navigate(['/home']);
    }
    this.signinService.userlogin(payload).subscribe((res: any) => {
      console.log("res", res);
      if(res){
        
      }
      // error methods will be hanlded
      else {
        // if any error occurs then this block will execute
      }
    }, 
    error => {
        alert("Something went wrong!");
        console.log("Something went wrong!", error);
    });
  }


  getAllData(){
    // API call for login
    this.signinService.getAllProducts().subscribe((data: any) => {
      console.log("products data:", data);
      if (data) {
        // if login success, this block of code will be executed
      }
      // error methods will be hanlde
      else {
        // if any error occurs then this block will execute
      }
    }, error => {
      alert("Something went wrong!");
      console.log("Something went wrong!", error);
    })
  }

}

// GET, DELETE => body/payload is not needed
// POST, PUT, PATCH => body/payload is needed
// backend response => 
// {
//  code: 200,
//  message: "success/failed", 
//  data: {}/null
// }