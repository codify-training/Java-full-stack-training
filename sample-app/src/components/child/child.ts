import { Component, EventEmitter, Input, Output } from '@angular/core';

@Component({
  selector: 'app-child',
  imports: [],
  templateUrl: './child.html',
  styleUrl: './child.css',
})
export class Child {
  // @input() => used to send data from parent to child
  // @Input() userName: string = '';

  // event emitter
  @Output() messageEvent = new EventEmitter<any>();

  sendData() {
    this.messageEvent.emit("Hello User");
  }

}
