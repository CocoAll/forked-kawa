import { Component } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Observable } from 'rxjs';


@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title: string = "";
  testApi: string = "";

  constructor(private http: HttpClient) {
    this.title = 'Spring Boot - Angular Application';
  }

  ngOnInit() {
      this.http.get('http://localhost:8080/test', {responseType: 'text'}).subscribe(data => {
        this.testApi = data;
      });
    }
}
