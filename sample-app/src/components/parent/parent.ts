import { Component, computed, effect, OnDestroy, OnInit, signal } from '@angular/core';
import { Child } from "../child/child";
import { HttpClient } from '@angular/common/http';
import { Router } from '@angular/router';
import { SigninService } from '../../service/signin-service';
import { Subscription } from 'rxjs/internal/Subscription';
import { CommonModule } from '@angular/common';

@Component({
  selector: 'app-parent',
  imports: [CommonModule],
  templateUrl: './parent.html',
  styleUrl: './parent.css',
})
export class Parent implements OnInit, OnDestroy {

  clickCount = signal(0);

  appTitle = 'Zenith bank';

  appName = signal("Zenith Bank");

  dummyData = signal<any[]>([]);

  price = signal(10);

  total = computed(() => this.price() * 2);

  


  changePrice() {
    this.price.set(5);
  }


  dummyList = signal([]);
  objectSignal = signal({});

  readonly booleanSignal = signal(true);
  isLoggedIn: boolean = true;
 
  loggedIn = signal(false);


  private dataSubscription: Subscription | undefined;

  constructor(private router: Router, private http: HttpClient, private signinService: SigninService) {
    effect(() => {
      console.log("effect block user login status:", this.loggedIn());
    })
  }

  ngOnInit() {
    this.getAllData();
  }

  updateStatus() {
    this.loggedIn.update(status => !status);
  }

  updateName() {
    this.appName.set("Zenith Bank Limited");
  }

  increaseCount() {
    this.clickCount.update(c => c + 1);
  }

  decrement() {
    this.clickCount.update(c => c - 1);
  }

  reset() {
    this.clickCount.set(0);
  }

  getAllData() {
    // API call for login
    this.dataSubscription = this.signinService.getAllProducts().subscribe((data: any) => {
      console.log("products data:", data.products);

      this.dummyList.set(data.products);
      console.log("signal used dummy data", this.dummyList());


      if (data.length !== 0) {
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

  viewProduct(data: any) {
    console.log("product data:", data)
    this.router.navigate([`view/product/${data.id}`],
      {
        queryParams:
        {
          sku: data.sku,
          status: data.availabilityStatus
        }
      });
  }

  ngOnDestroy(): void {
    // it will prevents memory leaks and also wont make unwanted API calls 
    this.dataSubscription?.unsubscribe();
  }

}


