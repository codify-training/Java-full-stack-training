import { Component, EventEmitter, Output } from '@angular/core';
import { Child } from "../child/child";

@Component({
  selector: 'app-parent',
  imports: [Child],
  templateUrl: './parent.html',
  styleUrl: './parent.css',
})
export class Parent {

  // data that should be passed to child html selector template
  userName:string = "naveen0913";




}
