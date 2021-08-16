import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Admin } from './admin';

@Injectable({
  providedIn: 'root'
})
export class AdminService {
  baseUrl: string = "http://localhost:8090/admin/"
  isLoggedIn : boolean = false;
  constructor(private myhttp : HttpClient) { }

  findAdminByUsernameService(auname : String, aupwd: String) : Observable<Admin[]>{
    return this.myhttp.get<Admin[]>(this.baseUrl+"getAdmin/"+auname+"/"+aupwd);
  }
}
