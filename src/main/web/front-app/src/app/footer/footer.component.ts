import { Component } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';


@Component({
  selector: 'footer-component',
  templateUrl: './footer.component.html',
})
export class FooterComponent {

  constructor(private http: HttpClient) {
  }

}
