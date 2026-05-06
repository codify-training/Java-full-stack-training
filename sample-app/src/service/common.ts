import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root',
})
export class Common {

  applicationName="cafe app";

  showAlert(message: string): void {
    alert(message);
  }

}
