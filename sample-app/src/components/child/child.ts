import { Component, EventEmitter, inject, Input, OnChanges, OnInit, Output, SimpleChanges } from '@angular/core';
import { MAT_DIALOG_DATA, MatDialogContent, MatDialogRef } from '@angular/material/dialog';
import { Parent } from '../parent/parent';
import { MatDialogModule } from '@angular/material/dialog';

@Component({
  selector: 'app-child',
  imports: [MatDialogModule],
  templateUrl: './child.html',
  styleUrl: './child.css',
})
export class Child implements OnChanges, OnInit {

  // @input() => used to send data from parent to child
  // @Input() userName: string = '';
  readonly dialogRef = inject(MatDialogRef<Parent>);

  // important to receive data from parent component
  data = inject(MAT_DIALOG_DATA);


  // event emitter
  @Output() messageEvent = new EventEmitter<any>();

  @Input() count: number = 0;

  currentProductId: any;

  ngOnChanges(changes: SimpleChanges): void {
    console.log("child component changes done", changes)
  }

  ngOnInit(): void {
    console.log("dialog data", this.data);

  }

  sendData() {
    this.messageEvent.emit("Hello User");
  }

  onNoClick(): void {
    this.dialogRef.close();
  }

}
