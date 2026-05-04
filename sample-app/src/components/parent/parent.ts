import { Component, EventEmitter, Output } from '@angular/core';

@Component({
  selector: 'app-parent',
  imports: [],
  templateUrl: './parent.html',
  styleUrl: './parent.css',
})
export class Parent {

  // data that should be passed to child html selector template
  userName:string = "naveen0913";




}
