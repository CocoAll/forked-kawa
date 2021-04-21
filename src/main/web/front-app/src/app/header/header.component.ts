import { Component } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';


@Component({
  selector: 'header-component',
  templateUrl: './header.component.html',
})
export class HeaderComponent {

  constructor(private http: HttpClient) {
  }

}
