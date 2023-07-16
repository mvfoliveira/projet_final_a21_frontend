import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { Livres } from '../models/livres';

@Injectable({
  providedIn: 'root',
})
export class LivresService {

  constructor(private http: HttpClient) { }

  getLivres(): Observable<Livres[]> {
    return this.http.get<Livres[]>('http://localhost:8080/livres');
  }
}
