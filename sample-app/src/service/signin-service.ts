import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root',
})
export class SigninService {

  constructor(private http: HttpClient) { }

  userlogin(body: any) {
    return this.http.post('https://dummyjson.com/auth/login', body);
  }

  getAllProducts() {
    return this.http.get('https://dummyjson.com/products');
  }

}
