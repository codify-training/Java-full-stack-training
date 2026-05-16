import { Component, EventEmitter, Input, OnChanges, OnInit, Output, SimpleChanges } from '@angular/core';

@Component({
  selector: 'app-child',
  imports: [],
  templateUrl: './child.html',
  styleUrl: './child.css',
})
export class Child implements OnChanges,OnInit{

  // @input() => used to send data from parent to child
  // @Input() userName: string = '';

  // event emitter
  @Output() messageEvent = new EventEmitter<any>();

  @Input() count:number = 0;

  currentProductId:any;

  ngOnChanges(changes: SimpleChanges): void {
    console.log("child component changes done",changes)
  }

  ngOnInit():void {

  }

  sendData() {
    this.messageEvent.emit("Hello User");
  }

}
