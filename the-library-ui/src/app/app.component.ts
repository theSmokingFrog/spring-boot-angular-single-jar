import { Component, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { map } from 'rxjs/operators';

@Component({
  selector:    'app-root',
  templateUrl: './app.component.html',
  styleUrls:   ['./app.component.scss']
})
export class AppComponent implements OnInit {
  mockedUser$: Observable<{ firstName, lastName }>;

  constructor(private http: HttpClient) {
  }

  public ngOnInit(): void {
    this.mockedUser$ = this.http.get('/api/user').pipe(map(response => response as { firstName: string, lastName: string }));
  }
}
